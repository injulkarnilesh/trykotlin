package types


fun main() {
    val java: MyOldJava = MyOldJava();
    java.noAnnotationString = "Nilesh"
    println(java.noAnnotationString.length)

    java.noAnnotationString = null
    //println(java.noAnnotationString.length)
    //NPE ^

    java.noAnnotationString = null
    println(java.noAnnotationString?.length)

    //val kstr: String = java.noAnnotationString
    //IllegalStateException as kstr is non-null
    //this is thrown very early to avoid NPE later
    //Kotlin compiler adds
    //Intrinsics.checkExpressionValueIsNotNull(kstr, "java.noAnnotationString")
    //similar check is added for kotlin method called from java
    //if only kotlin is used, avoid this check with compiler option

    java.nullableString = "Nilesh"
    //println(java.nullableString.length)
    //does not compile

    java.nullableString = null
    println(java.nullableString?.length)

    java.nonNullableString = "Nilesh"
    println(java.nonNullableString.length)

    //java.nonNullableString = null
    // does not compile null can not be assigned

}