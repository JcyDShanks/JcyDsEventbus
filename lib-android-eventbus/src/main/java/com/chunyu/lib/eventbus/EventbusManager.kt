package com.chunyu.lib.eventbus

import org.greenrobot.eventbus.EventBus

object EventBusManager {

    /*
    * 注册方法
    * */
    fun register(subscriber: Any) {
        EventBus.getDefault().register(subscriber)
    }
    /*
    * 解除监听方法
    * */
    fun unRegister(subscriber: Any) {
        EventBus.getDefault().unregister(subscriber)
    }
    /*
    * 发消息
    * */
    fun <T: BaseEventType>notify(type: T) {
        EventBus.getDefault().post(
            type
        )
    }
    /*
    * 暂不支持stick类型，在一些极端情况下，使用粘性事件将会导致测试和问题修复的难度增加
    * */
}