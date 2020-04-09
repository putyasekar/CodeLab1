package com.diki.idn.codelab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var baseValue: String
    private lateinit var heightValue: String
    private var result: Double? = null
    private var fieldEmpty: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate.setOnClickListener {
            baseValue = base.text.toString().trim()
            heightValue = height.text.toString().trim()

            if (baseValue.isEmpty()) {
                fieldEmpty = true
                base.error = resources.getString(R.string.error_empty_field)
            }
            if (heightValue.isEmpty()) {
                fieldEmpty = true
                height.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                result = (baseValue.toDouble() * heightValue.toDouble()) * 0.5
                tv_result.setText(result.toString())
            }


        }
    }
}
