package com.cfm.controller;

import com.cfm.client.DetailClient;
import com.cfm.entity.Detail;
import com.cfm.entity.ResultEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:25
 */
@Api("帖子模块")
@RestController
@RequestMapping("/consumer/detail")
public class DetailController {
    @Autowired
    private DetailClient detailClient;

    @ApiOperation(value = "条件查询帖子",
            httpMethod = "GET",
            protocols = "HTTP",
            produces = "application/json",
            response = ResultEntity.class,
            notes = "可以根据分类编号查询指定帖子信息，分类编号为null或者小于等于0就查询全部帖子信息")
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public ResultEntity queryBySortId(@ApiParam(name = "sortId",value = "分类编号")
                                          @RequestParam Integer sortId){
        List<Detail> details = detailClient.queryBySortId(sortId);
        return ResultEntity.successWithData(details);
    }

    @ApiOperation(value = "增加帖子",
            httpMethod = "POST",
            protocols = "HTTP",
            produces = "application/json",
            response = ResultEntity.class,
            notes = "增加帖子")
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public ResultEntity saveDetail(@RequestBody Detail detail){
        Integer integer = detailClient.saveDetail(detail);
        if(integer>0){
            return ResultEntity.successNoData();
        }
        return ResultEntity.failed("增加失败");
    }

    @ApiOperation(value = "修改帖子",
            httpMethod = "POST",
            protocols = "HTTP",
            produces = "application/json",
            response = ResultEntity.class,
            notes = "根据帖子编号修改指定帖子信息")
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ResultEntity updateDetail(@RequestBody Detail detail){
        Integer integer = detailClient.updateDetail(detail);
        if(integer>0){
            return ResultEntity.successNoData();
        }
        return ResultEntity.failed("修改失败");
    }

    @ApiOperation(value = "删除帖子",
            httpMethod = "GET",
            protocols = "HTTP",
            produces = "application/json",
            response = ResultEntity.class,
            notes = "根据帖子编号删除指定帖子信息")
    @RequestMapping(value = "del/{id}",method = RequestMethod.GET)
    public ResultEntity deleteDetail(@ApiParam(name = "id",value = "帖子编号")
                                         @PathVariable("id") Integer id){
        Integer integer = detailClient.deleteDetail(id);
        if(integer>0){
            return ResultEntity.successNoData();
        }
        return ResultEntity.failed("删除失败");
    }
}
