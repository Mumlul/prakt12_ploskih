import kotlin.math.*
open class `class`(){
    fun Input():Int {
        println("Введите сколько гипотенуз вы хотите расссичтать")
        var Save=readln()!!.toInt()
        if(Save>0)
            return Save
        else {
            println("не,нельзя.Надо больше нуля поэтому теперь 1")
            return 1
        }
    }

    fun Calculation():String
    {
        println("Введите первый катет"); var a=readln()!!.toDouble()
        println("Введите второй катет"); var b=readln()!!.toDouble()
        if(a<=0||b<=0){println("циферки то странные ЗАНОВО");Calculation()}
        else{
            var c:Double
            var c1=a.pow(2.0)+b.pow(2.0)
            c= sqrt(c1)
            return "катет 1:$a катет 2:$b гипотенуза:$c"
        }
return ""
    }
}