package com.chin.oa.mapper;

import com.chin.oa.entity.Notice;
import com.chin.oa.utils.MybatisUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoticeMapperTest {

    @Test
    public void insert
            () {
        MybatisUtils.executeUpdate(sqlSession -> {
            NoticeMapper mapper = sqlSession.getMapper(NoticeMapper.class);
            mapper.insert(new Notice(2l,"测试消息"));
            return null;
        });
    }
}