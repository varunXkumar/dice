package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button =findViewById(R.id.rollbtn)
        val textView:TextView=findViewById(R.id.textView1)
        val dice:ImageView=findViewById(R.id.imageView4)
        rollButton.setOnClickListener{
            //Toast.makeText(this, "clicked on Button", Toast.LENGTH_SHORT).show()
        var c:Int=(1..6).random()
        textView.text= c.toString()
            when(c){
                1->dice.setImageResource(R.drawable.dice_1)
                2->dice.setImageResource(R.drawable.dice_2)
                3->dice.setImageResource(R.drawable.dice_3)
                4->dice.setImageResource(R.drawable.dice_4)
                5->dice.setImageResource(R.drawable.dice_5)
                6->dice.setImageResource(R.drawable.dice_6)
            }
        }
    }
}
