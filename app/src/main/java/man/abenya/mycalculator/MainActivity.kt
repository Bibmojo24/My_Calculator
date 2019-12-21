package man.abenya.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var e:String= "${btn_1.text}"+ "${btn_pls.text}"+ "${btn_2.text}"+ "${btn_mult.text}"+ "${btn_3.text}"
        tv_screenE.text= e

        // DEL:
        btn_del.setOnClickListener{
            tv_screenE.text= tv_screenE.text.dropLast(1)
            tv_screenR.text= "0"
        }

        // CLEAR:
        btn_clr.setOnClickListener{
            tv_screenE.text= ""
            tv_screenR.text= "0"
        }

        var exp_text: Expression

        btn_equal.setOnClickListener {
            ExpressionBuilder("${tv_screenE.text}").build()
            tv_screenR.text = exp_text.evaluate().toString()
        }


        // Exemple of using the External Library Expj4:
        // https://www.objecthunter.net/exp4j/apidocs/index.html


    }
}
