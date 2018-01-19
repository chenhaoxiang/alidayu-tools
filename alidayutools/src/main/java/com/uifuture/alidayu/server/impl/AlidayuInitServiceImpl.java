package com.uifuture.alidayu.server.impl;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.uifuture.alidayu.config.AlidayuAccountConfig;
import com.uifuture.alidayu.server.AlidayuInitService;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 10:07.
 * Explain:
 */
public class AlidayuInitServiceImpl implements AlidayuInitService {
    private static AlidayuAccountConfig alidayuAccountConfig;
    public void setAlidayuAccountConfig(AlidayuAccountConfig alidayuAccountConfig){
        this.alidayuAccountConfig = alidayuAccountConfig;
    }
    public AlidayuAccountConfig getAlidayuAccountConfig(){
        return alidayuAccountConfig;
    }
}
