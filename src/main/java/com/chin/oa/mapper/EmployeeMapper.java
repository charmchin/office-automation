package com.chin.oa.mapper;

import com.chin.oa.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    public Employee selectById(Long employeeId);
    public List<Employee> selectByParams(Map params);
}
/**
 * 接口中是方法名，接口写好后，要到Mybatis配置文件中进行注册
 */