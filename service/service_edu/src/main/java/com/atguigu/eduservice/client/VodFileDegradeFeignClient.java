package com.atguigu.eduservice.client;

import com.atguigu.commonutils.R;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VodFileDegradeFeignClient implements VodClient {
   //出错之后会执行
    @Override
    public R removeAlyVideo(String id) {
        System.out.println("删除视频出错了");
        return R.error().message("删除视频出错了");
    }

    @Override
    public R deleteBatch(List<String> videoIdList) {
        System.out.println("删除多个视频出错了");
        return R.error().message("删除多个视频出错了");
    }
}
