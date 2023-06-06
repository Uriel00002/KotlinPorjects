fun main (){
     val numero1 = 12;
     val numero2 = 15;

     borde ("=", 20);
     var resultado =  suma (numero1, numero2);
     println(resultado);
     borde("*", 35);



    //Ejemplo 1 de funcion anonima
    val slogan = {r : Int -> println("Tu puedes con $r problemas y mas")};

    //Invocar la funcion anonima parte 1
    slogan(resultado);

    val resta = {num1 : Int, num2 : Int-> n1- n2};
        println("Resta : ${resta(12,18)}"n);

    //Funcion asincrona de promedio
    val promedio = {n1 : Int, n2 : Int, n3 : Int, n4 : Int, n5 : Int -> (n1+n2+n3+n4+n5)/5};
    println("promedio = ${promedio(10,9,8,10,8)}");

    //Funcion asincrona del mayor de tres numeros
    val max = {a: Int, b:Int, c:Int -> 
        if(a>b && a>c)a
        else if(b>a && b > c)b
        else if(c> a && c > b)c
        else "son iguales"
    }
        println("valor maximo:${max(5,8,9)}");

}

fun borde (caracter : String , veces : Int){
    for(i in 1..veces){
        println(caracter);
    }
    println();
}

fun suma(n1 : Int, n2 :Int): Int{
    return n1 + n2;
}




