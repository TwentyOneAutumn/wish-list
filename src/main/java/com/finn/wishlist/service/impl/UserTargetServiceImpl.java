package com.finn.wishlist.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finn.wishlist.domain.UserTarget;
import com.finn.wishlist.domain.dto.UserTargetListDto;
import com.finn.wishlist.domain.entry.Build;
import com.finn.wishlist.domain.entry.TableInfo;
import com.finn.wishlist.domain.vo.UserTargetListVo;
import com.finn.wishlist.mapper.UserTargetMapper;
import com.finn.wishlist.service.IUserTargetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserTargetServiceImpl extends ServiceImpl<UserTargetMapper, UserTarget> implements IUserTargetService {

    /**
     * 列表
     */
    @Override
    public TableInfo<UserTargetListVo> toList(UserTargetListDto dto) {
        String id = dto.getId();
        List<UserTarget> list = list(new LambdaQueryWrapper<UserTarget>()
                .eq(UserTarget::getUserId, id)
        );
        List<UserTargetListVo> voList = BeanUtil.copyToList(list, UserTargetListVo.class);
        return Build.table(voList);
    }
}
