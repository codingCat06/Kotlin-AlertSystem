package com.example.study_2023_11_30_alertsystem

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.study_2023_11_30_alertsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("주의!")
                .setMessage("메시지")
                .setPositiveButton("확인",DialogInterface.OnClickListener { dialogInterface, i ->  Positive_Button()})
                .setNegativeButton("취소", DialogInterface.OnClickListener { dialogInterface, i -> Negative_Button() })
            builder.show()
        }

        binding.button2.setOnClickListener {
            val Items : Array<String> = arrayOf("사과","포도","복숭아","키위","바나나")
            val builder = AlertDialog.Builder(this)
                .setTitle("과일 선택")
                .setItems(Items, DialogInterface.OnClickListener { dialogInterface, i ->
                    Choice(Items[i])
                })
            builder.show()
        }
    }
    private fun Positive_Button(){
        Toast.makeText(this@MainActivity, "You Click Positive_Button", Toast.LENGTH_SHORT).show()
    }
    private fun Negative_Button(){
        Toast.makeText(this@MainActivity, "You Click Negative_Button", Toast.LENGTH_SHORT).show()
    }
    private fun Choice(choice : String){
        Toast.makeText(this@MainActivity, "${choice}", Toast.LENGTH_SHORT).show()
    }
}