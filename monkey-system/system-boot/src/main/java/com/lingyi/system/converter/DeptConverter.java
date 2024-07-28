package com.lingyi.system.converter;

import com.lingyi.system.pojo.entity.SysDept;
import com.lingyi.system.pojo.form.DeptForm;
import com.lingyi.system.pojo.vo.dept.DeptDetailVO;
import com.lingyi.system.pojo.vo.dept.DeptVO;
import org.mapstruct.Mapper;

/**
 * 部门对象转换器
 *
 * @author Yixiaoyi03
 * @date 2022/7/29
 */
@Mapper(componentModel = "spring")
public interface DeptConverter {

    DeptForm entity2Form(SysDept entity);

    DeptVO entity2Vo(SysDept entity);

    SysDept form2Entity(DeptForm deptForm);

}