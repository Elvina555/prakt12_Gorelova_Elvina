class Class1
{
    fun Input():Int
    {
        println("Введите сколько раз вы хотите вычислить площадь фигур:")
        var n= readLine()!!.toInt()
        if(n>0)
        {
            return n
        }
        else
        {
            println("Количество вычислений должно быть больше 0")
            return 1
        }
    }
    fun Square()
    {
        try {
            println("Введите a:")
            var a = readLine()!!.toDouble()
            println("Введите b:")
            var b = readLine()!!.toDouble()
            println("Введите h:")
            var h = readLine()!!.toDouble()
            if (a >= 0 && b >= 0 && h >= 0) {
                println("Выбирите площадь какой фигуры вы ходите вычислить:")
                println("1-Параллелограмм, 2-Квадрат, 3-Пямоугольник")
                var v = readLine()!!.toInt()
                if (v == 1) {
                    println("$a*$h=${a * h}")
                    println("S=${a * h}")
                } else
                    if (v == 2) {
                        println("$a*$a=${a * a}")
                        println("S=${a * a}")
                    } else
                        if (v == 3) {
                            println("$a*$b=${a * b}")
                            println("S=${a * b}")
                        } else {
                            println("Введите другое значение")
                        }
            } else {
                println("Площадь фигуры не может быть меньше 0")
            }
        }catch (E:Exception)
        {
            println("Введите корректно")
        }
    }
}