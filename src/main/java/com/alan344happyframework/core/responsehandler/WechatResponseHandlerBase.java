package com.alan344happyframework.core.responsehandler;

import lombok.extern.slf4j.Slf4j;

/**
 * @author AlanSun
 * @date 2019/7/5 16:04
 **/
@Slf4j
public class WechatResponseHandlerBase extends WechatResponseHandlerAbstract<Object> {
    private WechatResponseHandlerBase() {
    }

    private static WechatResponseHandlerBase wechatResponseHandlerBase = new WechatResponseHandlerBase();

    public static WechatResponseHandlerBase getInstance() {
        return wechatResponseHandlerBase;
    }
}
