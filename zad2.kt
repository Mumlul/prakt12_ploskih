import kotlinx.coroutines.delay
open class zad2(var log:String, var pass:String, var number:Int, var open:Boolean) {

    suspend fun SortedRep(reposit: List<zad2>): List<zad2> {
        delay(2000L)
            return reposit.filter { it.open }.sortedWith(compareBy{ it.number})
    }

    suspend fun Get_info():String{
        delay(1000)
        return "LOGIN:$log,Password:$pass,Number:$number,"
    }
}