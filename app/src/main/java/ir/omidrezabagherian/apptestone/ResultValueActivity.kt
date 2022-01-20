package ir.omidrezabagherian.apptestone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.omidrezabagherian.apptestone.databinding.ActivityResultValueBinding

class ResultValueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityResultValueBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val bundle = intent.extras

        val user = bundle?.get("usernameKey")
        val pass = bundle?.get("passwordKey")

        binding.textViewUsername.text = user.toString()
        binding.textViewPassword.text = pass.toString()

        binding.buttonOut.setOnClickListener {
            val intentMain = Intent(this,MainActivity::class.java)
            startActivity(intentMain)
        }
    }
}