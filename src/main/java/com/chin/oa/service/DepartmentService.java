package com.chin.oa.service;

import com.chin.oa.entity.Department;
import com.chin.oa.mapper.DepartmentMapper;
import com.chin.oa.utils.MybatisUtils;

public class DepartmentService {
    public Department selectById(Long departmentId) {
        return (Department)MybatisUtils.executeQuery(sqlSession -> sqlSession.getMapper(DepartmentMapper.class).selectById(departmentId));
    }
}
