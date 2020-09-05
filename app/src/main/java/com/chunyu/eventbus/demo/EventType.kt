package com.chunyu.eventbus.demo

import com.chunyu.lib.eventbus.BaseEventType

/*
* @推荐使用方式
* 定义一个继承自BaseEventType接口的密封类，
* 将密封类的子类作为消息类型
* 在密封类的子类中定义属性和方法实现传递消息内容
* */

sealed class EventType: BaseEventType {
    object Logout: EventType()
    object ScanCode: EventType()
    object RefreshData: EventType()
    class SendMessage(val message: String): EventType()
    class ReplaceModel(val model: Model): EventType()
}