fun main() {
    val values = IntArray(5)
    
    values[0] = 1
     values[1] = 5
     values[2] = 7
    values[3] = 15
     values[4] = 5
    
    println("-	-	-	-	-	-	-	-	-	-")
    
    for(v in values){
        println(v)
    }
    
    println("-	-	-	-	-	-	-	-	-	-")
    
    values.forEach{
        println(it)
    }
    
     println("-	-	-	-	-	-	-	-	-	-")
     values.sort()
     
     for (index in values.indices){
         println(values[index])
     }
     
     println("-	-	-	-	-	-	-	-	-	-")
     
     val nomes = Array(3){""}
     nomes[0] = "Maria"
     nomes[1] = "José"
     nomes[2] = "Accyel"
    nomes.sort()
    
    nomes.forEach{
        println(it)
    }
    
    println("-	-	-	-	-	-	-	-	-	-")
    
    val empresas = arrayOf("SAMSUNG", "Dell", "LG")
    
    empresas.sort()
    empresas.forEach{
        println(it)
    }
    
    println("-	-	-	-	-	-	-	-	-	-")
    
    val salarios = DoubleArray(3)
    salarios[0] = 1000.75
    salarios[1] = 765.20
    salarios[2] = 1280.62
    
    salarios.sort()
    
    salarios.forEachIndexed {index, salario -> 
        salarios[index] = salario * 1.15
        println("Salario $index: " + salario)
    }
    
    println("\n-	-	-	max, min, average, filter, count, find, any	-	-	-")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}\n")
    
    val salMaiorQ2500 = salarios.filter{it > 2500.0}
    salMaiorQ2500.forEach{println(it)}
    
    println("\nCount\n")
    println(salarios.count{ it in 1200.00..3000.00})
    
    println("\nFind\n")
    println(salarios.find{ it == 879.98})
    println(salarios.find{ it == 900.00})
    
    println("\nAny\n")
    println(salarios.any{ it == 765.20})
    println("\n\n\n\n\n")
    
    
}

