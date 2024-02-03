package com.chin.oa.mapper;

import com.chin.oa.entity.Node;
import com.chin.oa.utils.MybatisUtils;

import java.util.List;

//这个mapper用于执行刚才的sql语句
public class RbacMapper {
    public List<Node> selectNodeByUserId(Long userId){
        List list = (List) MybatisUtils.executeQuery(sqlSession -> sqlSession.selectList("rbacmapper.selectNodeByUserId", userId));
        return list;
    }
    //写好后，向上推演到service！
}

