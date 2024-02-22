package com.chin.oa.mapper;

import com.chin.oa.entity.LeaveForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LeaveFormMapper {
    public void insert(LeaveForm form);//写完接口后，要到mappers目录下写xml
    public List<Map> selectByParams(@Param("pf_state") String pfState,@Param("pf_operator_id") Long pfOperatorId);
    public void update(LeaveForm form);
    public LeaveForm selectById(Long formId);
}
