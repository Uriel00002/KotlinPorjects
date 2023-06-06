fun main(){
 
    val ladas : Map <Int,String> = mapOf(
        1 to "USA";
        34 to "España";
        52 to "Mexico";
        67 to "Colombia";
        70 to "Argentina";
    )
    println(ladas);
    println(ladas[1]);
    println();

    ladas.forEach(action = {(key.value)->println("La clave de lada de $value es $key")})
    println();
    //Imprimiendo em mapa usando Lambda
    ladas.forEach{(k,v) -> println("$k -> $v")}
    println("La lada de Colombia es ${ladas.filter{it.value == "Colombia"}.keys}");

    println("Tamaño : ${ladas.size}");

    //Recuperar solo las claves
    println("Claves ${ladas.keys}");
    //Recuperar solo las claves
    println("Valores ${ladas.values}");
    //Recuperar solo las entradas
    println("Entradas : ${ladas.entries}");
    //Comprobar si un valor existe, si no enviar default
    println("Valor de la lada 48 : ${ladas.gerOrDefault(48,"Pais desconocido")}");
    //Comprobar si el mapa esta vacio
    println("Mapa vacio : ${ladas.isEmpty()}");
    //Comprobar si existe una clave especifica en el mapa 
    println("Existe la clave lada 86: ${86 in ladas}");
    //Comprobar si existe un valor en el mapa 
    println("Exite el valir Mexico en el mapa ${"Mexico" in ladas.values}");

    //mapa mutable
    var nums = mutableMapOf(
        "one" to 1;
        "two" to 2;
        "three" to 3;
        "four" to 4;
    );

    println("Mapa de numeros : $nums");
    //eliminar valores del mapa 
    nums.remove("two");
    println("Mapa nuevo de numeros : $nums");

    nums["Six"] = 6;

    var sortedNums = nums.toSortedMap();
    println("Mapa ordenado : $sortedNums");

    //Reto : 
    //Crear un diccionario espanol - ingles usando un mapa
    //Funcion para crear o cargar el diccionario
    //Funcion para consulta, reciba una palabra en español y regrese  su traduccion y si no existe traduccion un valir por default
    //Poder imprimir todo el diccionario
// Función Diccionario ingles 

fun crearDiccionario(): MutableMap<String, String> {
    val diccionario = mutableMapOf<String, String>()
    
    diccionario["mochila"] = "backpack"
    diccionario["calle"] = "street"
    diccionario["casa"] = "house"
    diccionario["queso"] = "cheese"
    diccionario["Lapiz"] = "Pencil"
    diccionario["libro"] = "book"
    diccionario["libreta"] = "notebook"
    return diccionario
}

fun consultarTraduccion(diccionario: MutableMap<String, String>, palabra: String): String? {
    return diccionario[palabra]
}
fun main() {
    val diccionario = crearDiccionario()

    // Consulta de la traducción de la palabra
    val palabra = "casa"
    val traduccion = consultarTraduccion(diccionario, palabra)
    if (traduccion != null) {
        println("La traducción de '$palabra' es '$traduccion'.")
    } else {
        println("La palabra '$palabra' no se encontró en el diccionario.")
    }


}
