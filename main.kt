import kotlinx.coroutines.*
suspend fun main()= runBlocking{
    var reposit=mutableListOf<zad2>()
    var pr=true
    while (pr==true) {
        try {
            println("new user")
            println("login(exit to stop)")
            var login = readln()
            if (login == "exit") break
            else{
                println("password")
                var pas = readln()
                if(pas.length<8) {println("Вы ввели странный пароль поэтому пока");return@runBlocking}
                println("number")
                var number = readln()!!.toInt()
                if(number<0) {println("Вы ввели отрицательное число поэтому пока");return@runBlocking}
                println("open(yes or not)?")
                var nn = readln()
                var open: Boolean
                if (nn == "yes") {
                    open = true
                } else open = false
                var r1: zad2 = zad2(login, pas, number, open)
                reposit.add(r1)
            }
        } catch (e: Exception) {
            println("Nein")
        }
    }
    try{
        var repos=reposit.first().SortedRep(reposit.toList())
        for(i in 0..repos.count()-1)
        {
            println(repos[i].Get_info())
        }
    }catch (e:Exception){

    }

    main1()
}



suspend fun main1(){
    var cc:`class`=`class`()
    var k=cc.Input()
    GlobalScope.launch {
        for(i in 1..k){
            println("$i raz")
            println(cc.Calculation())
        }
    }
    runBlocking { delay(300000) }
}





