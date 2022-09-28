package com.example.health_app

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "2159a419042df74cc4dfa243b7caa53b")
    }
}