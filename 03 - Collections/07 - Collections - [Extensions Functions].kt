import java.math.BigDecimal

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
    	"1500".toBigDecimal(),
    	"4000".toBigDecimal())
    
    println("\n-	-	- Somatoria 	-	-	-")
    println(salarios.somatoria())
    
    println("\n-	-	- Media 	-	-	-")
    println(salarios.media())
   
}

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
	else this.somatoria() / this.size.toBigDecimal()