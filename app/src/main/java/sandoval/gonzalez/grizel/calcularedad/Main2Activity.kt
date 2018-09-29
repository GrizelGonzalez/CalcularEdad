package sandoval.gonzalez.grizel.calcularedad

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import java.time.Year
import java.util.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnCalculate.setOnClickListener {
            if (!etDate.text.equals("")){
                val year = etDate.text.toString().toInt()
                val age = calYear(year)
                val act3 = Intent(this, Main3Activity::class.java)
                act3.putExtra("age", age)
                startActivity(act3)
            }else{
                Toast.makeText(applicationContext, "Campo Vacio", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun calYear(year: Int):Int{
        val date = Calendar.getInstance().get(Calendar.YEAR)
        return date - year
    }
}
