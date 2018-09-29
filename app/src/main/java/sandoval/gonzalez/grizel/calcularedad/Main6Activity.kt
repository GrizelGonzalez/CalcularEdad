package sandoval.gonzalez.grizel.calcularedad

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main6.*

class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val imc = intent.getFloatExtra("imc", 0.0f)
        interpretaIMC(imc)

    }
    fun interpretaIMC(imc:Float){
        var rutaFoto = "url"
        var resultado = "No sé"
        if (imc<=18.4){
            resultado = "Bajo peso"
            rutaFoto = "https://i.pinimg.com/originals/06/00/a9/0600a93c7c4cb1eee95efc3ced43c96b.jpg"
            //bajo peso
        }
        if (imc in 18.5..24.9){
            resultado = "Normal peso"
            rutaFoto = "https://lh6.googleusercontent.com/--G4IcD-1KKM/TXlMEEugZeI/AAAAAAAAA-I/TkOaxKWxPkE/s1600/taylor-lautner-527.jpg"
        }
        if (imc>=25){
            resultado = "Sobre peso"
            rutaFoto = "http://img.izismile.com/img/img5/20120906/640/the_evolution_of_josh_peck_640_02.jpg"
            //sobrepeso
        }
        Picasso.get().load(rutaFoto).into(ivResultado)
        tvResultado.text = resultado
    }
}
