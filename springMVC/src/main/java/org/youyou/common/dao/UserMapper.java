package org.youyou.common.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.youyou.common.domain.User;

/**
 *
 * @author youpengfeiinfo
 * @version 13-3-29
 */

public interface UserMapper {
    @Select("SELECT * FROM users WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);
}
