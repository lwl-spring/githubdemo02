package com.cfm.client;

import com.cfm.entity.Detail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zsw
 * @date 2020/5/13 17:41
 */
@FeignClient(value = "FORUM-PROVIDER",contextId = "detail")
public interface DetailClient {

    @RequestMapping(value = "/detail/get",method = RequestMethod.GET)
    public List<Detail> queryBySortId(@RequestParam(required = false) Integer sortId);

    @RequestMapping(value = "/detail/save",method = RequestMethod.POST)
    public Integer saveDetail(@RequestBody Detail detail);

    @RequestMapping(value = "/detail/update",method = RequestMethod.POST)
    public Integer updateDetail(@RequestBody Detail detail);

    @RequestMapping(value = "/detail/del/{id}",method = RequestMethod.GET)
    public Integer deleteDetail(@PathVariable("id") Integer id);
}
