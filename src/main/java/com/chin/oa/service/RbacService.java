package com.chin.oa.service;

import com.chin.oa.entity.Node;
import com.chin.oa.mapper.RbacMapper;

import java.util.List;

//这个处理逻辑就是进行mapper的传递调用
public class RbacService {
    private RbacMapper rbacMapper = new RbacMapper();
    public List<Node> selectNodeByUserId(Long userId){
        return rbacMapper.selectNodeByUserId(userId);
    }
}
