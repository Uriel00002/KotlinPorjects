//Listas 
fun main(){
    //Listas inmutables
    val readOnly : List <String> = listOf("Lunes","Martes","Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
    println(readOnly);
    println("Tamaño de la lista : ${readOnly.size}");
    println("Elemento en la posicion 3 : ${readonly.get(3)}");    
    println("Primer elemento de la lista : ${readonly.first()}");
    println("Ultimo elemento de la lista: ${readonly.last()}");
    //Mostrar elementos de la lista usando estructura for
    println("Elementos de readOnly:")
    for(elemento in readOnly){
        println(elemento);
    }
    //Mostrar los elementos de la lista usando el metodo forEach
    println("Elementos de readOnly usando forEach");
    readOnly.forEach{
        println(it)
        };

    //Lita mutable
    var mutableList : mutableList<String> = mutableListOf("Lunes", "Martes");
    println("Lista mutable : $mutableList");
    mutableList.add("Miercoles");
    println("Lista mutable : $mutableList");

    //Trabajanfo con lista muyables vacias
    var emptyList : mutableList<String> = mutableListOf();
    println("La lista esta vacia ?: ${emptyList.none()}");
    println("Primer elemento de emptyList: ${emptyList.firstOrNull}");
    println("Ultimo elemento de emptyList: ${emptyList.lastOrNull}");
    println("Elemento en la posicion dos de emptyList: ${emptyList.elementAtOrNull(2)}");

    //Agregando elementos a emptyList
    readOnly.forEach{
        emptyList.add(it);
    }
    println("La lista que estaba vacia: $emptyList"); 

    //Ordenar una lista 
    val numerosDeLoteria = listOf(11, 2, 44, 33, 56, 78, 66);
    println("Numeros de loteria: $numerosDeLoteria");
    val numerosOrdenados = numerosDeLoteria.sorted();
    println("Numeros de loteria: $numerosOrdenados");
    val numerosDescendentes = numerosDeLoteria.sortedDescending();
    println("Numeros ordenados de forma descendente: $numerosDescendentes");
    val numerosPares = numerosDeLoteria.filter{num -> num % 2 == 0};
    println("Numeros pares : $numerosPares");

}