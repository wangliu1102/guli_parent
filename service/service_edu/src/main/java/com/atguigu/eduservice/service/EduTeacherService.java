package com.atguigu.eduservice.service;

import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.entity.vo.TeacherQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author 王柳
 * @since 2020-06-08
 */
public interface EduTeacherService extends IService<EduTeacher> {

    /**
     * 讲师条件查询，带分页
     * @param pageParam
     * @param teacherQuery
     */
    void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);

    //1 分页查询讲师的方法
    Map<String, Object> getTeacherFrontList(Page<EduTeacher> pageTeacher);
}
