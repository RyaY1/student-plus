package com.student.content.api;

import com.student.base.model.PageParams;
import com.student.base.model.PageResult;
import com.student.content.model.dto.QueryCourseParamsDto;
import com.student.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController
public class CourseBaseInfoController {

  @ApiOperation("课程查询接口")
  @RequestMapping("/course/list")
  public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParams){
      CourseBase courseBase = new CourseBase();
      courseBase.setName("测试名称");
      courseBase.setCreateDate(LocalDateTime.now());
      List<CourseBase> courseBases = new ArrayList<>();
      courseBases.add(courseBase);
      return new PageResult<>(courseBases,10,1,10);
  }

}