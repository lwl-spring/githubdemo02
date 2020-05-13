package com.cfm.service.impl;

import com.cfm.entity.Detail;
import com.cfm.entity.DetailExample;
import com.cfm.mapper.DetailMapper;
import com.cfm.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:10
 */
@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailMapper detailMapper;

    @Override
    public List<Detail> queryBySortId(Integer sortId) {
        DetailExample example=new DetailExample();
        DetailExample.Criteria criteria = example.createCriteria();
        if(null!=sortId && sortId>0){
            criteria.andSortidEqualTo(sortId);
        }
        return detailMapper.selectByExample(example);
    }

    @Override
    public Integer saveDetail(Detail detail) {
        return detailMapper.insert(detail);
    }

    @Override
    public Integer updateDetail(Detail detail) {
        return detailMapper.updateByPrimaryKey(detail);
    }

    @Override
    public Integer deleteDetail(Integer id) {
        return detailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteDetailBySortId(Integer sortId) {
        DetailExample example=new DetailExample();
        DetailExample.Criteria criteria = example.createCriteria();
        criteria.andSortidEqualTo(sortId);
        return detailMapper.deleteByExample(example);
    }
}
