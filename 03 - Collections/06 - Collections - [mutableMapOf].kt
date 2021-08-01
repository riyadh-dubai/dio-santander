fun main(){
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")
    
    val repositorio = Repositorio<Funcionario>()
    
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)
    
    
    println("\n-	-	-	map[id]	-	-	-")
    println(repositorio.findById(joao.nome))
    
    println("\n-	-	-	map.values	-	-	-")
    repositorio.findAll().forEach{println(it)}
    
    println("\n-	-	-	map.remove	-	-	-")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{println(it)}
    
    println("\n\n\n\n")
    
    
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

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()
    
    fun create(id: String, value: T) {
        map[id] = value
    }
    
    fun findById(id: String) = map[id]
    
    fun findAll() = map.values
    
    fun remove(id: String) = map.remove(id)
}