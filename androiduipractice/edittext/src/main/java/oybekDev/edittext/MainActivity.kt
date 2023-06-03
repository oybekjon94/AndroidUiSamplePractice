package oybekDev.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameEt = findViewById<EditText>(R.id.nameEt)
        val emailEt = findViewById<EditText>(R.id.emailEt)
        val passwordEt = findViewById<EditText>(R.id.passwordEt)
        val nameTv = findViewById<TextView>(R.id.nameTv)
        val emailTv = findViewById<TextView>(R.id.emailTv)
        val passwordTv = findViewById<TextView>(R.id.passwordTv)
        val registerBtn = findViewById<Button>(R.id.button)

        registerBtn.setOnClickListener{
            nameTv.text = "Name: ${nameEt.text}"
            emailTv.text = "Email: ${emailEt.text}"
            passwordTv.text = "Password: ${passwordEt.text}"
        }

    }
}