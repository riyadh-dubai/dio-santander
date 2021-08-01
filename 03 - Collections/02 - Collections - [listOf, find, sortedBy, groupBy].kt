fun main(){
    
    val riyadh = Funcionario("Riyadh", 1000.00, "CLT")
    val andre = Funcionario("Andre", 2750.00, "PJ")
    val naty = Funcionario("Naty", 875.00, "CLT")
    
    val funcionarios = listOf(riyadh, andre, naty)
    
    funcionarios.forEach{println(it)}
    
    println("\n-	-	-	Buscar(Find)	-	-	-")
    println(funcionarios.find{it.nome == "Naty"})
    
    println("\n-	-	-	OrdernarPor(sortedBy)	-	-	-")
    funcionarios
    	.sortedBy {it.salario}
        .forEach {println(it)}
        
     println("\n-	-	-	AgruparPor(groupBy)	-	-	-")
      funcionarios
    	.groupBy {it.contrato}
        .forEach {println(it)}
    
    println("\n\n\n")
    
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

