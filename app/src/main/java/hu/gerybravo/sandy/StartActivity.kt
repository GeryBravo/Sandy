package hu.gerybravo.sandy

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class StartActivity : AppCompatActivity(), View {

    private var submitButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        initUI()
    }

    override fun initUI() {
        submitButton = findViewById(R.id.button_navigation)
        submitButton?.setOnClickListener {
            startActivity(Intent(this@StartActivity, LottieActivity::class.java))
        }
    }
}