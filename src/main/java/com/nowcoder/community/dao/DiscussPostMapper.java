package com.nowcoder.community.dao;
import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// This Mapper interface is used to define the SQL mapping for database operations
@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数取别名
    // 如果只有一个参数，并且在<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

    // insert the discussion post
    int insertDiscussPost(DiscussPost discussPost);

    // select discussion post by id
    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id, int commentCount);
}
