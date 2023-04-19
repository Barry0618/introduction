package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count:Int = 0
    var word:String = ""
    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
    }

    fun AddOne(v:View) {
        if(v.id == R.id.btn) {
            count++
            if(count==1) {
                word = "大家好，我叫黃柏穎\n"
            }
            if(count==2) {
                word = "我來自台中，從嶺東高中畢業後就讀靜宜大學資管系，目前大二\n"
            }
            if(count==3) {
                word = "我的個性屬於比較慢熱型的人，待在一個環境久了才會比較活潑，\n" +
                        "也導致我從以前開始社交能力就很差，所以希望上大學後可以\n" +
                        "認識更多人，交更多朋友\n"
            }
            if(count==4) {
                word = "我平常的興趣是看動漫、打遊戲、聽音樂和唱歌\n" +
                        "有時喜歡自己一個人，有時也喜歡跟朋友一起出去玩\n"

            }
            if(count==5) {
                word = "在大學這兩年期間，體悟到了許多東西，而讓我最感興趣的是\n" +
                        "網頁製作，也希望自己能夠學得更多，對未來工作有幫助\n"

            }
        }
        else{
            count = 0
            word = "我的介紹的這，謝謝大家\n"
        }
        txv.text = word

    }

}