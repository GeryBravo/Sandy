package hu.gerybravo.sandy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    var lottieView : LottieAnimationView? = null
    var playAnimButton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        lottieView = findViewById(R.id.animation_view)

        playAnimButton = findViewById(R.id.button)
        playAnimButton?.setOnClickListener {
            lottieView?.playAnimation()
        }
    }
}
