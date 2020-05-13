package com.cfm.service.impl;

import com.cfm.entity.Sort;
import com.cfm.mapper.DetailMapper;
import com.cfm.mapper.SortMapper;
import com.cfm.service.DetailService;
import com.cfm.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:18
 */
@Service
public class SortServiceImpl implements SortService {
    @Autowired
    private SortMapper sortMapper;
    @Autowired
    private DetailService detailService;

    @Override
    public List<Sort> queryAllSort() {
        return sortMapper.selectByExample(null);
    }

    @Override
    public Integer saveSort(Sort sort) {
        return sortMapper.insert(sort);
    }

    @Override
    public Integer updateSort(Sort sort) {
        return sortMapper.updateByPrimaryKey(sort);
    }

    @Transactional
    @Override
    public Integer deleteSort(Integer id) {
        detailService.deleteDetailBySortId(id);
        return sortMapper.deleteByPrimaryKey(id);
    }
}
