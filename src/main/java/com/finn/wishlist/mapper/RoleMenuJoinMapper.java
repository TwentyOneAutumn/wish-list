package com.finn.wishlist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.finn.wishlist.domain.RoleInfo;
import com.finn.wishlist.domain.RoleMenuJoin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenuJoin> {
}
