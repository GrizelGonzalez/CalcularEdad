package sandoval.gonzalez.grizel.calcularedad

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val age = intent.getIntExtra("age", 0)
        interpretAge(age)
    }
    var rutaFoto = "Url"
    var resultado = "Resultdo"

    fun interpretAge(age:Int){
        if (age<= 5){
            resultado = "You are a Baby $age age"
            rutaFoto = "http://photos.costume-works.com/full/michael_jackson2.jpg"
        }
        if (age in 6..12){
            resultado ="You are a Child $age age"
            rutaFoto = "https://i2-prod.mirror.co.uk/incoming/article403189.ece/ALTERNATES/s615b/michael-jackson-the-early-years-pic-rex-190105664.jpg"
        }
        if (age in 13..17){
            resultado ="You are a Teenager $age age"
            rutaFoto = "http://classicalbumsundays.com/wp-content/uploads/2017/08/michael.jpg.png"
        }
        if (age in 18..40){
            resultado ="You are a Young Adult $age age"
            rutaFoto = "https://i.ebayimg.com/images/g/yf4AAOSw7W5XOSj6/s-l300.jpg"
        }
        if (age in 41..59){
            resultado ="You are an Old Adult $age age"
            rutaFoto = "http://thecynicalowl.com/wp-content/uploads/2013/09/MJ-dangerous-era-14597559-1000-1122.jpg"
        }
        if (age >=60){
            resultado ="Your are an Old Man $age age"
            rutaFoto = "http://images6.fanpop.com/image/photos/32300000/Michael-Jackson-Invincible-Era-invincible-era-32317487-833-1200.jpg"
        }

        Picasso.get().load(rutaFoto).into(ivResultado)
        tvResultado.text = resultado

    }
}
