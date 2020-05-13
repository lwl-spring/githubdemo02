package com.cfm.mapper;

import com.cfm.entity.Detail;
import com.cfm.entity.DetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailMapper {
    int countByExample(DetailExample example);

    int deleteByExample(DetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Detail record);

    int insertSelective(Detail record);

    List<Detail> selectByExample(DetailExample example);

    Detail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByExample(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}