package jp.techacademy.yoshiyuki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        val num1 = editText1.text.toString()
        val num2 = editText2.text.toString()
        var num3:Int = 0
        /*どのボタンが押されたか制御
         １：＋　２：－　３：×　４：÷
         疑問？：この時点で計算をして値を渡して次のページにいったほうが
         　　　　スムーズだと思うがこの時点で計算するとエラーになる。。。
         */
        if (v.id == R.id.button1)
        {
            num3 = 1
        }
        else if (v.id == R.id.button2)
        {
            num3 = 2
        }
        else if (v.id == R.id.button3)
        {
            num3 = 3
        }
        else if (v.id == R.id.button4)
        {
            num3 = 4
        }

        val intent = Intent(this, CalcActivity::class.java)
        //editText1の値
        intent.putExtra("VALUE1", num1)
        //editText2の値
        intent.putExtra("VALUE2", num2)
        //どのボタンが押されたかの値
        intent.putExtra("VALUE3", num3)
        startActivity(intent)

    }
}