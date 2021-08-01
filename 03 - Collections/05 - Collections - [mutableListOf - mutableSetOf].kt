fun main(){
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")
    
    println("\n-	-	-	mutableListOf	-	-	-\n\n")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }
    
    println("\n-	-	-	Adicionar (add)	-	-	-")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }
    
    println("\n-	-	-	Remover (remove)	-	-	-")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }
    
     println("\n-	-	-	mutableSetOf	-	-	-\n\n")
     val funSet = mutableSetOf(joao)
     funSet.forEach { println(it) }
     
     println("\n-	-	-	Adicionar (add) -	-	-")
     funSet.add(pedro)
     funSet.add(maria)
     funSet.forEach {println(it)}
     
     println("\n-	-	-	Remover (remove)	-	-	-")
     funSet.remove(maria)
     funSet.forEach { println(it) }
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

