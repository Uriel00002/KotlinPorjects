fun main(){
    var i = 1;
    println("Valores de i :");
    for (i in 1..10){
        println(i);
    }

    println();
    println("Letras: ");
    for (caracter  in 'a'..'g' step 2){
        println(caracter);
    }
    
    println();
    println("Letras en reversa : ");
    for (caracter  in 'g'..'a' downTo 2){
        println(caracter);
    }

    //recorriendo for con un arreglo
    val mascotas = arrayOf("Ginger", "Blackie", "Nicky", "Moka", "Moji");
    println();
    println("Mascotas :");
    for(i in mascotas.indice){
        println([$i, ${mascotas[i]}]);
    } 

    println();
    println("Dividiendo un string en caracteres");
    for (letra in "--Hola mundo Kotlin --"){
        println(letra);
    }

}