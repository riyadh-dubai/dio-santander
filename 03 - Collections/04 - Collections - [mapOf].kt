fun main(){
    println("\n-	-	-	mapOf()	-	-	-")
    val pair: Pair<String, Double> = Pair("Joao", 1500.75)
    val map1 = mapOf(pair)
    println("\n")
    
   
    map1.forEach {(k, v) -> println("Chave: $k - Valor: $v\n")}
    
    // Recurso infix do Kotlin
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    
    map2.forEach {(k, v) -> println("Chave: $k - Valor: $v")}
}