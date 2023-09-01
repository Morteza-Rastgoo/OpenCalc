package com.darkempire78.opencalculator

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyCarAppService : Service() {
    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}