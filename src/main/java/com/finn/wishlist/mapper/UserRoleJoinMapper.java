package com.finn.wishlist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.finn.wishlist.domain.RoleMenuJoin;
import com.finn.wishlist.domain.UserRoleJoin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleJoinMapper extends BaseMapper<UserRoleJoin> {
}
