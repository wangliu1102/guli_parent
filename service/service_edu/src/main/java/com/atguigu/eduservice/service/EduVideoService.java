package com.atguigu.eduservice.service;

import com.atguigu.eduservice.entity.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author 王柳
 * @since 2020-06-11
 */
public interface EduVideoService extends IService<EduVideo> {

    //1 根据课程id删除小节
    void removeVideoByCourseId(String courseId);
}
