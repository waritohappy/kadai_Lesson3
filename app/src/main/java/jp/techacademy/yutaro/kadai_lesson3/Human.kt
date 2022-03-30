package jp.techacademy.yutaro.kadai_lesson3
import android.util.Log

class Human(name:String,age:Int,var hobby:String):
    Animal(name,age) ,
    Thinkable{
        override fun say(){
            Log.d(LOG_TAG,"私の名前は"+this.name+"です。年は"+this.age.toString()+"歳です。")
        }
        override fun think(){
            Log.d(LOG_TAG,"私は"+this.hobby+"について考える。")
        }
}