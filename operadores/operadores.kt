fun main() {

    val a = 10; //inmutable
    val b = 5;  //inmutable 
    var c = 0;  //mutable (su valir puede cambiar)

    println(" Operadores: ");

    //suma
    //c = a.plus(b);
    c = a + b;
    println("$c = $a + $b");

    //resta
    //c = a.minus(b);
    c = a - b;
    println("$c = $a - $b");

    //divicion
    //c = a.div(b);
    c = a / b;
    println("$c = $a / $b");

    //multiplicacion
    //c = a.times(b);
    c = a * b;
    println("$c = $a * $b");

    //comparaciones
    println("b > a :");
    println(b.compareTo(a)>0); //b>a
    println("$b > $a = " + (b>a));
    println("a > b :");
    println(a.compareTo(b)>0); //a>b
    println("$a > $b = " + (a>b));

    println("b < a :");
    println(b.compareTo(a)<0); //b<a
    println("$b < $a = " + (a<b));
    println("a < b :");
    println(a.compareTo(b)<0); //a<b
    println("$a < $b = " + (a<b));

    //a != b
    println( " a != b : " );
    println(!(a.equals(b)));

}
