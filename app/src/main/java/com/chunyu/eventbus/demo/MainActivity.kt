package com.chunyu.eventbus.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.chunyu.lib.eventbus.EventSubscribe

class MainActivity : AppCompatActivity(), EventSubscribe<EventType>{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun receiverMassage(eventBean: EventType) {
        when(eventBean) {
            is EventType.ScanCode -> {
                Toast.makeText(this, "扫描成功", Toast.LENGTH_SHORT).show()
            }
            is EventType.SendMessage -> {
                Toast.makeText(this, eventBean.message, Toast.LENGTH_SHORT).show()
            }
            is EventType.ReplaceModel -> {
                Toast.makeText(this, eventBean.model.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}