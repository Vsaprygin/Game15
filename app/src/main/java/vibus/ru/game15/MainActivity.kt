package vibus.ru.game15

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.os.Vibrator
import android.view.View
import android.widget.Chronometer
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


var newstart: Boolean = false

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       // жмем на картинку 15
        image15.setOnClickListener {
            val newIntent = Intent(this, AboutActivity::class.java)
            startActivity(newIntent)
        }
    }
// жмем на кнопки двигаем цифры и проверяем победу
    fun b11 (view: View) {b11()
        win ()}
    fun b12 (view: View) {b12()
        win ()}
    fun b13 (view: View) {b13()
        win ()}
    fun b14 (view: View) {b14()
        win ()}
    fun b21 (view: View) {b21()
        win ()}
    fun b22 (view: View) {b22()
        win ()}
    fun b23 (view: View) {b23()
        win ()}
    fun b24 (view: View) {b24()
        win ()}
    fun b31 (view: View) {b31()
        win ()}
    fun b32 (view: View) {b32()
        win ()}
    fun b33 (view: View) {b33()
        win ()}
    fun b34 (view: View) {b34()
        win ()}
    fun b41 (view: View) {b41()
        win ()}
    fun b42 (view: View) {b42()
        win ()}
    fun b43 (view: View) {b43()
        win ()}
    fun b44 (view: View) {b44()
        win()
    }
// проверяем победу, каждый раз после нажатия кнопок
    private fun win () {
    val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    vibrator.vibrate(50)
        if (newstart){
            when {
                button11.text != "1" -> return
                button12.text != "2" -> return
                button13.text != "3" -> return
                button14.text != "4" -> return
                button21.text != "5" -> fon.setBackgroundColor(
                    resources.getColor(
                        R.color.green1,
                        null
                    )
                )
                button22.text != "6" -> return
                button23.text != "7" -> return
                button24.text != "8" -> return
                button31.text != "9" -> fon.setBackgroundColor(
                    resources.getColor(
                        R.color.green2,
                        null
                    )
                )
                button32.text != "10" -> return
                button33.text != "11" -> return
                button34.text != "12" -> return
                button41.text != "13" -> return
                button42.text != "14" -> return
                button43.text != "15" -> return
                button44.text == "" -> {
                    var MyText = Toast.makeText(this, "Вы победили", Toast.LENGTH_SHORT)
                    var meter = findViewById<Chronometer>(R.id.c_meter)
                    meter.stop()
                    MyText.show()
                    fon.setBackgroundColor(resources.getColor(R.color.green3, null))
                    buttonStart.text = "Еще раз?"
                }

            }
    }
    }
// перемешиваем кнопки
    fun start (view: View) {
          var temp = 44
          var a: Int
        for (i in 1..1000) {
          a = (Math.random() * 4 + 1).toInt()
          when (a) {
              1 -> temp = temp - 1
              2 -> temp = temp - 10
              3 -> temp = temp + 1
              4 -> temp = temp + 10
          }
          when {
              temp in 1..4 -> temp = temp + 20
              temp in 51..54 -> temp = temp - 20
              temp % 10 == 0 -> temp = temp + 2
              temp % 10 == 5 -> temp = temp - 2
          }
          when (temp) {
              11 -> b11()
              12 -> b12()
              13 -> b13()
              14 -> b14()
              21 -> b21()
              22 -> b22()
              23 -> b23()
              24 -> b24()
              31 -> b31()
              32 -> b32()
              33 -> b33()
              34 -> b34()
              41 -> b41()
              42 -> b42()
              43 -> b43()
              44 -> b44()
          }
            fon.setBackgroundColor(resources.getColor(R.color.startFon, null))
            newstart = true
            buttonStart.text = "Рестарт"
      }
        var meter = findViewById<Chronometer>(R.id.c_meter)
        meter.base = SystemClock.elapsedRealtime()
        meter.start() // meter.stop()

    }
// двигаем кнопки
    fun b11 () {
        var temp = button11.text.toString()
        when {
            button21.text == "" -> {
                button21.text = temp
                button11.text = ""
            }
            button12.text == "" -> {
                button12.text = temp
                button11.text = ""
            }
        }
    }

    fun b12 () {
        var temp = button12.text.toString()
        when {
            button11.text == "" -> {
                button11.text = temp
                button12.text = ""
            }
            button22.text == "" -> {
                button22.text = temp
                button12.text = ""
            }
            button13.text == "" -> {
                button13.text = temp
                button12.text = ""
            }
        }
    }

    fun b13 () {
        var temp = button13.text.toString()
        when {
            button12.text == "" -> {
                button12.text = temp
                button13.text = ""
            }
            button23.text == "" -> {
                button23.text = temp
                button13.text = ""
            }
            button14.text == "" -> {
                button14.text = temp
                button13.text = ""
            }
        }
    }

    fun b14 () {
        var temp = button14.text.toString()
        when {
            button13.text == "" -> {
                button13.text = temp
                button14.text = ""
            }
            button24.text == "" -> {
                button24.text = temp
                button14.text = ""
            }
        }
    }

    fun b21 () {
        var temp = button21.text.toString()
        when {
            button11.text == "" -> {
                button11.text = temp
                button21.text = ""
            }
            button22.text == "" -> {
                button22.text = temp
                button21.text = ""
            }
            button31.text == "" -> {
                button31.text = temp
                button21.text = ""
            }
        }
    }

    fun b22 () {
        var temp = button22.text.toString()
        when {
            button21.text == "" -> {
                button21.text = temp
                button22.text = ""
            }
            button12.text == "" -> {
                button12.text = temp
                button22.text = ""
            }
            button23.text == "" -> {
                button23.text = temp
                button22.text = ""
            }
            button32.text == "" -> {
                button32.text = temp
                button22.text = ""
            }
        }
    }

    fun b23 () {
        var temp = button23.text.toString()
        when {
            button22.text == "" -> {
                button22.text = temp
                button23.text = ""
            }
            button13.text == "" -> {
                button13.text = temp
                button23.text = ""
            }
            button24.text == "" -> {
                button24.text = temp
                button23.text = ""
            }
            button33.text == "" -> {
                button33.text = temp
                button23.text = ""
            }
        }
    }

    fun b24 () {
        var temp = button24.text.toString()
        when {
            button23.text == "" -> {
                button23.text = temp
                button24.text = ""
            }
            button14.text == "" -> {
                button14.text = temp
                button24.text = ""
            }
            button34.text == "" -> {
                button34.text = temp
                button24.text = ""
            }
        }
    }

    fun b31 () {
        var temp = button31.text.toString()
        when {
            button21.text == "" -> {
                button21.text = temp
                button31.text = ""
            }
            button32.text == "" -> {
                button32.text = temp
                button31.text = ""
            }
            button41.text == "" -> {
                button41.text = temp
                button31.text = ""
            }
        }
    }

    fun b32 () {
        var temp = button32.text.toString()
        when {
            button31.text == "" -> {
                button31.text = temp
                button32.text = ""
            }
            button22.text == "" -> {
                button22.text = temp
                button32.text = ""
            }
            button33.text == "" -> {
                button33.text = temp
                button32.text = ""
            }
            button42.text == "" -> {
                button42.text = temp
                button32.text = ""
            }
        }
    }

    fun b33 () {
        var temp = button33.text.toString()
        when {
            button32.text == "" -> {
                button32.text = temp
                button33.text = ""
            }
            button23.text == "" -> {
                button23.text = temp
                button33.text = ""
            }
            button34.text == "" -> {
                button34.text = temp
                button33.text = ""
            }
            button43.text == "" -> {
                button43.text = temp
                button33.text = ""
            }
        }
    }

    fun b34 () {
        var temp = button34.text.toString()
        when {
            button33.text == "" -> {
                button33.text = temp
                button34.text = ""
            }
            button24.text == "" -> {
                button24.text = temp
                button34.text = ""
            }
            button44.text == "" -> {
                button44.text = temp
                button34.text = ""
            }
        }
    }

    fun b41 () {
        var temp = button41.text.toString()
        when {
            button31.text == "" -> {
                button31.text = temp
                button41.text = ""
            }
            button42.text == "" -> {
                button42.text = temp
                button41.text = ""
            }
        }
    }

    fun b42 () {
        var temp = button42.text.toString()
        when {
            button41.text == "" -> {
                button41.text = temp
                button42.text = ""
            }
            button32.text == "" -> {
                button32.text = temp
                button42.text = ""
            }
            button43.text == "" -> {
                button43.text = temp
                button42.text = ""
            }
        }
    }

    fun b43 () {
        var temp = button43.text.toString()
        when {
            button42.text == "" -> {
                button42.text = temp
                button43.text = ""
            }
            button33.text == "" -> {
                button33.text = temp
                button43.text = ""
            }
            button44.text == "" -> {
                button44.text = temp
                button43.text = ""
            }
        }
    }

    fun b44 () {
        var temp = button44.text.toString()
        when {
            button43.text == "" -> {
                button43.text = temp
                button44.text = ""
            }
            button34.text == "" -> {
                button34.text = temp
                button44.text = ""
            }
        }
    }

}
