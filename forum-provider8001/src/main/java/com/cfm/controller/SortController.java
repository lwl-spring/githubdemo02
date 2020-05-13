package com.cfm.controller;

import com.cfm.entity.Sort;
import com.cfm.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:30
 */
@RestController
@RequestMapping("sort")
public class SortController {
    @Autowired
    private SortService sortService;

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public List<Sort> queryAllSort(){
        return sortService.queryAllSort();
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Integer saveSort(@RequestBody Sort sort){
        return sortService.saveSort(sort);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Integer updateSort(@RequestBody Sort sort){
        return sortService.updateSort(sort);
    }

    @RequestMapping(value = "del/{id}",method = RequestMethod.GET)
    public Integer deleteSort(@PathVariable("id") Integer id){
        return sortService.deleteSort(id);
    }
}
