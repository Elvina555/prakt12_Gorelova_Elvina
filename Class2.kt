import kotlinx.coroutines.*
class Class2(var login:String, var parol:String,var repozit:Int,var Open:Boolean) {
    suspend fun sort(repoz:List<Class2>):List<Class2>
    {
        delay(2000L)
        return repoz.filter { it.Open }.sortedWith(compareBy{it.repozit})
    }
    suspend fun Info():String{
        delay(1000L)
        return "Логин:$login, Пароль:$parol, Количество репозиториев:$repozit"
    }
}
