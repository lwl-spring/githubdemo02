package com.cfm.service;

import com.cfm.entity.Sort;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:15
 */
public interface SortService {

    /**
     * 查询全部分类信息
     * @return
     */
    List<Sort> queryAllSort();

    /**
     * 增加分类信息
     * @param sort
     * @return
     */
    Integer saveSort(Sort sort);

    /**
     * 修改分类信息
     * @param sort
     * @return
     */
    Integer updateSort(Sort sort);

    /**
     * 根据分类编号删除分类(级联删除)
     * @param id
     * @return
     */
    Integer deleteSort(Integer id);
}
