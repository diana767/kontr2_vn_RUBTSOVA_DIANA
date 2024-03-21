import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
suspend fun main()= runBlocking {
    try{
        println("введите кол-во повторов:")
        var k= readLine()!!.toInt()
        if(k>0){
            while (k>0){
                k=k-1
                var tv=Tovar("",0.0,"","",0,0,0,0)
                try{
                    launch {
                        tv.InfoTovar()
                        tv.OutputInfo()
                        tv.Cennik()
                        tv.Kategiria()
                        tv.Katch()
                    }
                    delay(3000L)
                    tv.Test()
                }catch (e:Exception){ println("error")}
            }
        }else {
            println("не может быть ноль повторов")}
    }catch (e:Exception){ println("error")}
}