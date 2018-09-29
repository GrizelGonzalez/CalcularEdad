package sandoval.gonzalez.grizel.calcularedad

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSingIn.setOnClickListener {
            if (etUser.text.toString().equals("grizel") and etPassword.text.toString().equals("5008")){
               toast("Welcome "+etUser.text.toString())
                val act4: Intent = Intent(this, Main4Activity::class.java)
                startActivity(act4)
            }else{
                toast("!!Usuer or Password are wrong!!", Toast.LENGTH_SHORT)

            }
        }
    }
    fun toast(mensaje:String, duracion:Int = Toast.LENGTH_LONG){
        Toast.makeText(applicationContext, mensaje, duracion).show()
    }
}
