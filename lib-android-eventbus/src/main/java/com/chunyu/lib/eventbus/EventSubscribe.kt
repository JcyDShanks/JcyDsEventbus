package com.chunyu.lib.eventbus

import org.greenrobot.eventbus.Subscribe

interface EventSubscribe<T: BaseEventType> {
    /*
    * 内部的监听方法
    * */
    @Subscribe
    fun onEvent(eventBean: T) {
        receiverMassage(eventBean)
    }

    /*
    * 外部需要实现的处理消息的方法
    * */
    fun receiverMassage(eventBean: T)

}

/*
* 用于限制消息类型
* */
interface BaseEventType