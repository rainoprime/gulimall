package com.liujinshui.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujinshui.common.utils.PageUtils;
import com.liujinshui.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:09:11
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

