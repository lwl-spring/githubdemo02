package com.cfm.mapper;

import com.cfm.entity.Sort;
import com.cfm.entity.SortExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SortMapper {
    int countByExample(SortExample example);

    int deleteByExample(SortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sort record);

    int insertSelective(Sort record);

    List<Sort> selectByExample(SortExample example);

    Sort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sort record, @Param("example") SortExample example);

    int updateByExample(@Param("record") Sort record, @Param("example") SortExample example);

    int updateByPrimaryKeySelective(Sort record);

    int updateByPrimaryKey(Sort record);
}