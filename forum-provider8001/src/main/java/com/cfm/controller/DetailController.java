package com.cfm.controller;

import com.cfm.entity.Detail;
import com.cfm.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:25
 */
@RestController
@RequestMapping("detail")
public class DetailController {
    @Autowired
    private DetailService detailService;

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public List<Detail> queryBySortId(@RequestParam(required = false) Integer sortId){
        return detailService.queryBySortId(sortId);
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Integer saveDetail(@RequestBody Detail detail){
        return detailService.saveDetail(detail);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Integer updateDetail(@RequestBody Detail detail){
        return detailService.updateDetail(detail);
    }

    @RequestMapping(value = "del/{id}",method = RequestMethod.GET)
    public Integer deleteDetail(@PathVariable("id") Integer id){
        return detailService.deleteDetail(id);
    }
}
