open class Tovar(override var name:String, override var cena:Double,override var ed:String,override var vid:String,override var kol:Int,override var k:Int ,var data:Int,var data2:Int,):Abstract()
{
    override fun InfoTovar() {
        try{
            println("Введите название товара")
            name= readLine()!!.toString()
            println("Введите цену товара")
            cena= readLine()!!.toDouble()
            println("Введите ед измерения товара")
            ed = readLine()!!.toString()
            println("Введите вид товара")
            vid = readLine()!!.toString()
            println("Введите категорию товара : \n1-молочка \n2-мясо \n3-рыба")
            k = readLine()!!.toInt() ;if (k!=1&&k!=2&&k!=3)  println("такого ответа нет")
            println("Введите год покупки товара")
            data= readLine()!!.toInt()
            println("Введите год изготовления товара")
            data2= readLine()!!.toInt()
            do {
                println("Введите кол-во товара")
                kol = readLine()!!.toInt()
            }while (kol<0)
        }catch (e:Exception){ println("error")}

    }
    override fun OutputInfo(){
        println("Название товара: $name \nЦена товара: $cena\n ед измерения товара: $ed\nвид товара: $vid")
    }
    override fun Cennik(){
        var oc=kol*cena
        println("Общая цена вашего товара $oc")

    }
    override fun Kategiria() {

        when (k) {
            1 -> println("вы выбрали молочку")
            2 -> println("вы выбрали мясо")
            3 -> println("вы выбрали рыбу")

        }
    }
        fun Katch()
        {
            when{
                (kol>5&&k<10)-> println("за 5 и более купленных товаров в нашей компании, вам 2 в подарок")
                (kol>10)-> println("за 10 и более купленных товаров в нашей компании, вам 5 в подарок")
            }
        }
        fun Test()
        {
            val cc=data-data2
            when {
                (cc>2)-> println("товар непригоден")
                (cc<2)-> println("товар пригоден")
            }
        }
    }

