package com.student.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.student.content.model.dto.TeachplanDto;
import com.student.content.model.po.Teachplan;

import java.util.List;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author ray
 */
public interface TeachplanMapper extends BaseMapper<Teachplan> {

    public List<TeachplanDto> selectTreeNodes(long courseId);

}
