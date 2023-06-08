package com.example.simpleuielements

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.widget.SwitchCompat
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val checkbox = findViewById<CheckBox>(R.id.checkbox)
        checkbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this, "CheckBox cliked", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "CheckBox unchecked", Toast.LENGTH_SHORT).show()
        }

        val switcher = findViewById<SwitchCompat>(R.id.switcher)
        switcher.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this, "Switcher cliked", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Switcher unchecked", Toast.LENGTH_SHORT).show()
        }

        val toggleBtn = findViewById<ToggleButton>(R.id.togglebtn)
        toggleBtn.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this, "Toggle button cliked", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Toggle button unchecked", Toast.LENGTH_SHORT).show()
        }

        val slider = findViewById<Slider>(R.id.slider)
        slider.addOnChangeListener{_, value, _ ->
            Toast.makeText(this, "Slider value changed $value",Toast.LENGTH_SHORT).show()

        }
        val rangeSlider = findViewById<RangeSlider>(R.id.rangeSlider)
        rangeSlider.addOnChangeListener{ s, value, fromUser ->
            Toast.makeText(this, "Slider value changed from ${s.values[0]} to ${s.values[1]}",Toast.LENGTH_SHORT).show()

        }
    }
}