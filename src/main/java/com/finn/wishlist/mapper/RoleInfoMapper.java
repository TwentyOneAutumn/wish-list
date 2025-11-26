package com.finn.wishlist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.finn.wishlist.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
