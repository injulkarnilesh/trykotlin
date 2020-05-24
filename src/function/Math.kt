package function

fun max(x: Int, y: Int) = if (x > y) x else y;

fun displayMax(x: Int, y: Int) {  //:Unit void Optional
    println(max(x, y));
}