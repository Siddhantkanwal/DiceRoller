package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById(R.id.button)
        button.setOnClickListener(){
            Toast.makeText(this,"Dice Rolled !",Toast.LENGTH_LONG).show()
            roll()
        }
    }
    private fun roll(){
        val image:ImageView=findViewById(R.id.imageView2)
        val a=Dice(6)
        val b=a.roll()
        when(b){
            1->image.setImageResource(R.drawable.dice_1)
            2->image.setImageResource(R.drawable.dice_2)
            3->image.setImageResource(R.drawable.dice_3)
            4->image.setImageResource(R.drawable.dice_4)
            5->image.setImageResource(R.drawable.dice_5)
            else->image.setImageResource(R.drawable.dice_6)
        }
    }
}
class Dice(val side:Int){
    fun roll(): Int {
        return (1..side).random()
    }
}