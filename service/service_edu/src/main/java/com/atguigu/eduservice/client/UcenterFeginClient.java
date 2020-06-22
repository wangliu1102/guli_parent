package com.atguigu.eduservice.client;

import com.atguigu.commonutils.R;
import org.springframework.stereotype.Component;

/**
 * @author 王柳
 * @date 2020/6/18 9:04
 */
@Component
public class UcenterFeginClient implements UcenterClient {
    @Override
    public R getMemberInfoById(String id) {
        return R.error().message("根据id获取会员信息出错");
    }
}
