package com.tensquare.base.service.impl;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import com.tensquare.base.utils.IdWorker;
import com.tensquare.common.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    @Override
    public void addLabel(Label label) throws Exception {
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);

    }

    @Override
    public void updateLabel(Label label) throws Exception {
        labelDao.save(label);
    }

    @Override
    public void deleteLabel(String id) throws Exception {
        labelDao.deleteById(id);

    }

    @Override
    public CommonResult getLabelById(String id) throws Exception {
        CommonResult<Label> result = new CommonResult<Label>();
        Label label = labelDao.findById(id).get();
        return result.success(label);
    }

    @Override
    public CommonResult getLabelList(Label label) throws Exception {
        CommonResult result = new CommonResult();
        List<Label> list = labelDao.findAll(new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<>();
                if(!StringUtils.isEmpty(label.getLabelname())) {
                    list.add(cb.like(root.get("labelname").as(String.class), "%" + label.getLabelname() + "%"));
                }
                if(label.getState() != null) {
                    list.add(cb.equal(root.get("state").as(String.class), label.getState()));
                }

                query.where(cb.and(list.toArray(new Predicate[]{})));
                return query.getRestriction();
            }
        });

        return result.success(list);
    }
}
