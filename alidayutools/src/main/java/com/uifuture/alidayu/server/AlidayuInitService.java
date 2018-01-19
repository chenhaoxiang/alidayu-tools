package com.uifuture.alidayu.server;

import com.uifuture.alidayu.config.AlidayuAccountConfig;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 10:07.
 * Explain:
 */
public interface AlidayuInitService {
    /**
     * 设置阿里大于基本配置
     * @param alidayuAccountConfig
     */
    void setAlidayuAccountConfig(AlidayuAccountConfig alidayuAccountConfig);
    AlidayuAccountConfig getAlidayuAccountConfig();
}
