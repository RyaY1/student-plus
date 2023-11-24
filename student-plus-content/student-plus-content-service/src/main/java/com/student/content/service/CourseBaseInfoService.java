package com.student.content.service;

import com.student.base.model.PageParams;
import com.student.base.model.PageResult;
import com.student.content.model.dto.AddCourseDto;
import com.student.content.model.dto.CourseBaseInfoDto;
import com.student.content.model.dto.QueryCourseParamsDto;
import com.student.content.model.po.CourseBase;

/**
 * 课程基本信息管理业务接口
 *
 * @author yilei
 */
public interface CourseBaseInfoService {

    /**
     * 课程查询接口
     *
     * @param pageParams
     * @param queryCourseParamsDto
     * @return
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
}