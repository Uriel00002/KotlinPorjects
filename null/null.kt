fun main (){
    var mombre : String?= null;
    println("Imprimiendo el valor nulo de nombre");
    println(nombre);
    //nombre = "Ginger";
    //println(nombre!!.lenght);
    var longitud = nombre?.lenght ?: 0;
    println("Longitud de nombre :");
    println(longitud);  

    try{
        longitud = nombre?.lenght;
        //println("nombre : $nombre ");
    }catch(exception: NullPointerException){
        println("Ha ocurrido un error");
        println(exception);
        //hubo un error 
        longitud = 0;
        println("Longitud = $longitud");
    }finally{
        //
        println("Lo que esta en el finally, se ejecuta siempre");

}
        println("Termina la prueba de try");
}