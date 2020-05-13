package com.cfm.service;

import com.cfm.entity.Detail;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:04
 */
public interface DetailService {

    /**
     * 显示全部的帖子信息，按照帖子ID降序排列
     * @param sortId    分类编号
     * @return
     */
    List<Detail> queryBySortId(Integer sortId);

    /**
     * 增加帖子
     * @param detail
     * @return
     */
    Integer saveDetail(Detail detail);

    /**
     * 修改帖子
     * @param detail
     * @return
     */
    Integer updateDetail(Detail detail);

    /**
     * 根据帖子编号删除帖子
     * @param id    帖子编号
     * @return
     */
    Integer deleteDetail(Integer id);

    /**
     * 根据分类编号删除帖子
     * @param sortId    分类编号
     * @return
     */
    Integer deleteDetailBySortId(Integer sortId);
}
