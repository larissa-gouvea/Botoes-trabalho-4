package com.example.botoestrabalho4

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.google.android.material.chip.ChipGroup

class Botoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botoes)
        val BtnSwitch= findViewById<Switch>(R.id.switch1) as Switch
        val Texto= findViewById<TextView>(R.id.textView1) as TextView
        val BtnToggle= findViewById<Switch>(R.id.toggleButton) as ToggleButton
        val RootLayout= findViewById<View>(R.id.root_layout) as View
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val BtnProximaPagina= findViewById<Button>(R.id.button4)

        BtnProximaPagina.setOnClickListener {
            val intent = Intent(this, Botoes2::class.java)
            startActivity(intent)
        }
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton = findViewById<RadioButton>(checkedId)
                val mensagem = "Seu país é " + radioButton.text
                val textView2 = findViewById<TextView>(R.id.textView2)
                textView2.text = mensagem
            }
        BtnSwitch.setOnClickListener {
            if (BtnSwitch.isChecked){
                Toast.makeText(applicationContext,"Switch is on",Toast.LENGTH_LONG).show()
                Texto.setText("senha salva")

            } else {
                Toast.makeText(applicationContext,"Switch is off",Toast.LENGTH_LONG).show()
                Texto.setText("senha não salva")
            }
        }
        BtnToggle.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                RootLayout.setBackgroundColor(Color.YELLOW) //O fundo da tela fica amarelo
            }else{
                RootLayout.setBackgroundColor(Color.WHITE)//O fundo da tela fica branco
            }
        }
    }
}