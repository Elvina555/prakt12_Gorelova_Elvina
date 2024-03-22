import kotlinx.coroutines.*
suspend fun main()
{
    try {
        var Class1: Class1 = Class1()
        var a = Class1.Input()
        GlobalScope.launch {
            for (i in 1..a) {
                println("$i расчет")
                Class1.Square()
            }
        }
        runBlocking { delay(300000) }
    }catch (E:Exception)
    {
        println("Введите корректно")
    }
}
