package com.uifuture.alidayu.config;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 11:12.
 * Explain:
 */
public interface AlidayuTemplate<T> {
    /**
     * 模板类 - getter，setter方法请严格按照驼峰式命名
     * 如果T是String，直接写JSON字符串模板即可
     * @return
     */
    T getTemplate();

    /**
     * 手机号码 - 需要发送验证码到该手机上的
     * @return
     */
    String getMobilePhone();
}
