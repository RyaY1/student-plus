package com.student.content.service;

import com.student.content.model.dto.SaveTeachplanDto;
import com.student.content.model.dto.TeachplanDto;

import java.util.List;

public interface TeachplanService {

    /**
     * 查询课程计划树型结构
     *
     * @param courseId
     * @return
     */
    List<TeachplanDto> findTeachplanTree(long courseId);

    /**
     * 课程计划创建或修改
     * @param teachplanDto
     */
    void saveTeachplan(SaveTeachplanDto teachplanDto);
}
