package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;

import java.util.List;

public interface CourseService {

    /**
     * 多条件查询课程列表
     */
    public List<Course> findCourseByCondition(CourseVO courseVO);

    /**
     * 添加课程及讲师信息
     */
    public void saveCourseOrTeacher(CourseVO courseVO);

    /**
     * 根据ID查询课程信息
     */
    public CourseVO findCourseById(Integer id);

    /**
     * 更新课程及讲师信息
     */
    public void updateCourseOrTeacher(CourseVO courseVO);

    /**
     * 课程状态变更
     */
    public void updateCourseStatus(int courseid,int status);
}
