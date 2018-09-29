package sandoval.gonzalez.grizel.calcularedad

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        btnCalculate.setOnClickListener {
            //Verificar que se haya escrito algo
            if (!etWeight.text.equals("") and !etHeight.text.equals("")){
                //Podemos continuar
                val peso = etWeight.text.toString().toFloat()
                val altura = etHeight.text.toString().toFloat()
                val imc = calculaIMC(peso,altura)
                val i = Intent(this,Main6Activity::class.java)
                i.putExtra("imc",imc)
                startActivity(i)
            }else{
                //Mandamos mensaje de que ingrese datos

            }
        }
    }

    fun calculaIMC(peso:Float,altura:Float):Float{
        return  peso/(altura*altura)

    }
}
