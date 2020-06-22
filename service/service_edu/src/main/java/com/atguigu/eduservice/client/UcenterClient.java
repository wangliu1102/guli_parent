package com.atguigu.eduservice.client;

import com.atguigu.commonutils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 王柳
 * @date 2020/6/18 8:56
 */
@Component
@FeignClient(name = "service-ucenter", fallback = UcenterFeginClient.class)
public interface UcenterClient {

    //根据用户id获取用户信息
    @GetMapping("/educenter/member/getInfoUc/{id}")
    public R getMemberInfoById(@PathVariable("id") String id);
}
