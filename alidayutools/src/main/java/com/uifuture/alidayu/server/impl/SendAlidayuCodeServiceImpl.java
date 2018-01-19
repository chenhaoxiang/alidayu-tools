package com.uifuture.alidayu.server.impl;

import com.google.gson.Gson;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.uifuture.alidayu.config.AlidayuTemplate;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 11:09.
 * Explain:
 */
public class SendAlidayuCodeServiceImpl<T> extends AlidayuInitServiceImpl implements Callable {
    private AlidayuTemplate<T> alidayuTemplate;
    public SendAlidayuCodeServiceImpl(AlidayuTemplate alidayuTemplate) {
        this.alidayuTemplate = alidayuTemplate;
    }
    public Object call() throws Exception {
        TaobaoClient client = new DefaultTaobaoClient(super.getAlidayuAccountConfig().getUrl(),
                super.getAlidayuAccountConfig().getAppkey(),
        super.getAlidayuAccountConfig().getSecret());
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setExtend("");
        req.setSmsType("normal");
        req.setSmsFreeSignName(super.getAlidayuAccountConfig().getSmsFreeSignName());
        if(alidayuTemplate.getTemplate() instanceof String){
            req.setSmsParamString(alidayuTemplate.getTemplate().toString());
        }else{
            Gson gson = new Gson();
            req.setSmsParamString(gson.toJson(alidayuTemplate.getTemplate()));
        }
        req.setRecNum(alidayuTemplate.getMobilePhone());
        req.setSmsTemplateCode( super.getAlidayuAccountConfig().getSmsTemplateCode());
        return client.execute(req).getBody();
    }
}
