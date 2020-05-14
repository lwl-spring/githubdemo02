package com.cfm.controller;

import com.cfm.client.SortClient;
import com.cfm.entity.ResultEntity;
import com.cfm.entity.Sort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:30
 */
@Api("分类模块")
@RestController
@CrossOrigin
@RequestMapping("/consumer/sort")
public class SortController {
    @Autowired
    private SortClient sortClient;

    @ApiOperation(value = "分类查询",
            httpMethod = "GET",
            protocols = "HTTP",
            produces = "application/json",
            response = ResultEntity.class,
            notes = "查询全部分类")
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public ResultEntity queryAllSort(){
        List<Sort> sorts = sortClient.queryAllSort();
        return ResultEntity.successWithData(sorts);
    }

    @ApiOperation(value = "删除分类",
            httpMethod = "POST",
            protocols = "HTTP",
            produces = "application/json",
            response = ResultEntity.class,
            notes = "删除分类")
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public ResultEntity saveSort(@RequestBody Sort sort){
        Integer integer = sortClient.saveSort(sort);
        if(integer>0){
            return ResultEntity.successNoData();
        }
        return ResultEntity.failed("增加失败");
    }

    @ApiOperation(value = "修改分类",
            httpMethod = "POST",
            protocols = "HTTP",
            produces = "application/json",
            response = ResultEntity.class,
            notes = "根据分类编号修改指定分类信息")
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ResultEntity updateSort(@RequestBody Sort sort){
        Integer integer = sortClient.updateSort(sort);
        if(integer>0){
            return ResultEntity.successNoData();
        }
        return ResultEntity.failed("修改失败");
    }

    @ApiOperation(value = "删除分类",
            httpMethod = "GET",
            protocols = "HTTP",
            produces = "application/json",
            response = ResultEntity.class,
            notes = "根据分类编号删除指定分类信息")
    @RequestMapping(value = "del/{id}",method = RequestMethod.GET)
    public ResultEntity deleteSort(@PathVariable("id") Integer id){
        Integer integer = sortClient.deleteSort(id);
        if(integer>0){
            return ResultEntity.successNoData();
        }
        return ResultEntity.failed("删除失败");
    }
}
