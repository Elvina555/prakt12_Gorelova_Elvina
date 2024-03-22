import kotlinx.coroutines.*
fun main()= runBlocking {
    var repozit= mutableListOf<Class2>()
    var parol=""
    var kolrepoz=0
    var v=0
    while (true)
    {
        try {
            println("\nЗагрузите нового участника")
            println("Логин (exit для выхода)")
            val login= readLine()!!.toString()
            if(login=="exit") break
            println("Введите пароль не менее 8 символов:")
            parol= readLine()!!.toString()
            if(parol.length>=8)
            {
                println("Введите кол-во репозиториев:")
                kolrepoz= readLine()!!.toInt()
                if(kolrepoz>0)
                {
                    println("Каким вы хотите сделать свой репозиторий:")
                    println("1-открытый, 2-закрытый")
                    v=readLine()!!.toInt()
                    if(v!=1&&v!=2)
                    {
                        println("Такой вариант не существует")
                    }
                    val V:Boolean=v==1
                    var r=Class2(login,parol,kolrepoz,V)
                    repozit.add(r)
                }
                else
                {
                    println("Количество репозиториев не может быть меньше нуля")
                }
            }
            else
            {
                println("пароль должен быть больше 8 символов")
            }
        }catch (E:Exception)
        {
            println("Введите корректно")
        }
    }
    println("Подождите, идет закрузка")
    delay(3000)
    val sort=repozit.first().sort(repozit)
    sort.forEach{
        println(it.Info())
    }
}
