package com.chin.oa.service;

import com.chin.oa.entity.Notice;
import com.chin.oa.mapper.NoticeMapper;
import com.chin.oa.utils.MybatisUtils;

import java.util.List;

public class NoticeService {
    public List<Notice> getNoticeList (Long receiverId) {
        return (List)MybatisUtils.executeQuery(sqlSession -> {
            NoticeMapper mapper = sqlSession.getMapper(NoticeMapper.class);
            return mapper.selectByReceiverId(receiverId);
        });
    }
}
