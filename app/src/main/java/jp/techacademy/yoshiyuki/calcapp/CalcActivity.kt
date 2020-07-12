package jp.techacademy.yoshiyuki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc.*

class CalcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)
        val value3 = intent.getIntExtra("VALUE3", 0)

        if (value3 == 1)
        {
            textView.text = "${value1 + value2}"
        }
        else if (value3 == 2)
        {
            textView.text = "${value1 - value2}"
        }
        else if (value3 == 3)
        {
            textView.text = "${value1 * value2}"
        }
        else if (value3 == 4)
        {
            textView.text = "${value1 / value2}"
        }
    }
}