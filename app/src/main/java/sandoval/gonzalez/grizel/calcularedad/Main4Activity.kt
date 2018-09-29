package sandoval.gonzalez.grizel.calcularedad

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btnEdad.setOnClickListener{
            val act2: Intent = Intent(this, Main2Activity::class.java)
            startActivity(act2)
        }

        btnIMC.setOnClickListener{
            val act5: Intent = Intent(this, Main5Activity::class.java)
            startActivity(act5)

        }
    }
}
