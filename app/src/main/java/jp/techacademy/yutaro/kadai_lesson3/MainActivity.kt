package jp.techacademy.yutaro.kadai_lesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//パッケージ共通
    const val LOG_TAG="kotlintest"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taro = Human("太郎",20,"野球観戦")
        val jiro = Human("次郎",18,"サッカー観戦")

        taro.say()
        taro.think()
        jiro.say()
        jiro.think()

    }
}