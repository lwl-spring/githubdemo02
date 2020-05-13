package com.cfm.client;

import com.cfm.entity.Detail;
import com.cfm.entity.Sort;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:41
 */
@FeignClient(value = "FORUM-PROVIDER",contextId = "sort")
public interface SortClient {

    @RequestMapping(value = "/sort/get",method = RequestMethod.GET)
    public List<Sort> queryAllSort();

    @RequestMapping(value = "/sort/save",method = RequestMethod.POST)
    public Integer saveSort(@RequestBody Sort sort);

    @RequestMapping(value = "/sort/update",method = RequestMethod.POST)
    public Integer updateSort(@RequestBody Sort sort);

    @RequestMapping(value = "/sort/del/{id}",method = RequestMethod.GET)
    public Integer deleteSort(@PathVariable("id") Integer id);
}
