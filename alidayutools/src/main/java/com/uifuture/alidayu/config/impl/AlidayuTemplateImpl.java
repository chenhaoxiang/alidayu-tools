package com.uifuture.alidayu.config.impl;

import com.uifuture.alidayu.config.AlidayuTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 11:44.
 * Explain:
 */
public class AlidayuTemplateImpl<T> implements AlidayuTemplate {
    private T template;
    private String mobilePhone;
    public AlidayuTemplateImpl(T template, String mobilePhone) {
        this.template = template;
        this.mobilePhone=mobilePhone;
    }
    public T getTemplate() {
        return template;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
}
