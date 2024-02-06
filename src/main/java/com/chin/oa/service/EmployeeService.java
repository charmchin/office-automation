package com.chin.oa.service;

import com.chin.oa.entity.Employee;
import com.chin.oa.mapper.EmployeeMapper;
import com.chin.oa.utils.MybatisUtils;

public class EmployeeService {
    public Employee selectById(Long employeeId) {
        Employee employee = (Employee) MybatisUtils.executeQuery(sqlSession -> {
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            return mapper.selectById(employeeId);
        });
        return employee;
    }
}
