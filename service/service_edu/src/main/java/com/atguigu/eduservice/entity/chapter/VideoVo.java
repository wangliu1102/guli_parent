package com.atguigu.eduservice.entity.chapter;

import lombok.Data;

/**
 * 课程小结vo
 */
@Data
public class VideoVo {

    private String id;

    private String videoSourceId;//视频id

    private String title;

    private Integer isFree; // 是否可以试听：0收费 1免费
}
