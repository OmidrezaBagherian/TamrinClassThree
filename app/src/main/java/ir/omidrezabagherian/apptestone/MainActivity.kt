package ir.omidrezabagherian.apptestone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.omidrezabagherian.apptestone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonSubmit.setOnClickListener {
            if (binding.textInputUsername.text?.isNotEmpty() == true &&
                binding.textInputPassword.text?.isNotEmpty() == true
            ) {
                val intentResultValue = Intent(this, ResultValueActivity::class.java)
                    .apply {
                        putExtra("usernameKey", binding.textInputUsername.text)
                        putExtra("passwordKey", binding.textInputPassword.text)
                    }
                startActivity(intentResultValue)
            }
        }

    }
}