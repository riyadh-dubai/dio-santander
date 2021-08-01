fun main(){
    
    val riyadh = Funcionario("Riyadh", 1000.00, "CLT")
    val andre = Funcionario("Andre", 2750.00, "PJ")
    val naty = Funcionario("Naty", 875.00, "CLT")
    
     println("\n-   -   - setOf()   -   -   -")
    
    val funcionarios01 = setOf(riyadh, naty)
    val funcionarios02 = setOf(andre)
    
    println("\n-    -   -   União (union)   -   -   -")
    val resultUnion = funcionarios01.union(funcionarios02)
    resultUnion.forEach {println(it)}
    
    println("\n-    -   -   Subtração (subtract)    -   -   -")
    // Remove o que há de comum entre dois conjuntos
    val funcionarios03 = setOf(riyadh, andre, naty)
    val resultSub = funcionarios03.subtract(funcionarios02)
    resultSub.forEach{ println(it) }
    
    println("\n-    -   -   Interseção (intersect)  -   -   -")
    // Exibe o que há de comum entre dois conjuntos
    val resultInt = funcionarios03.intersect(funcionarios02)
    resultInt.forEach{ println(it) }
    
    println("\n\n\n\n\n")
    
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val contrato: String
) {
    override fun toString(): String {
        return "\nNome: $nome\nSalário:$salario"
    } 
}

