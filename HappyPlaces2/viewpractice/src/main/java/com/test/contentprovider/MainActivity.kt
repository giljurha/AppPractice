package com.test.contentprovider

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import com.test.contentprovider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val items = arrayOf("사과", "복숭아", "수박")
            AlertDialog.Builder(this).run {
                setTitle("items test")
                setIcon(android.R.drawable.ic_dialog_alert)
                setMultiChoiceItems(
                    items,
                    booleanArrayOf(true, false, true),
                    object : DialogInterface.OnMultiChoiceClickListener {
                        override fun onClick(
                            dialog: DialogInterface?,
                            which: Int,
                            isChecked: Boolean
                        ) {
                            Log.d("kkang","${items[which]}이 ${if(isChecked) "선택되었습니다." else "선택 해제되었습니다."}")
                        }
                    }
                )
            }

        }
    }
}