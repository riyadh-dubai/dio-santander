/*
    Calculadora Kotlin
    1º Desafio sugerido durante o Bootcamp Santander Developer Mobile

    Fazer uma calculadora, que recebe dois números float e em seguida um número inteiro para indicar
    a operação desejada
 */

// Declaração das constantes, o propósito delas é deixar o código mais legível
const val SOM = 1;
const val SUB = 2;
const val MUL = 3;
const val DIV = 4;
const val ENC = 5;

fun main ()
{
    // Variável para controlar o loop while
    var continua = true;

    // Enquanto o usuario desejar que o programe continue executando...
    while (continua){
        println("\nBem vindo ao Calculadora Kotlin!")
        println("Digite 1 para realizar uma nova operação ou 0 para sair\n")
        // Ler a entrada do usuário
        val entrada: Int = readLine()!!.toInt()

        // Direciona o fluxo do programa conforme o usuário escolheu
        if(entrada.equals(1)){
            println("Digite o primeiro número: ")
            val primeiroNum: Float = readLine()!!.toFloat();

            println("Digite o segundo número: ")
            val segundoNum: Float = readLine()!!.toFloat();

            println("\nQual operação deseja realizar?")
            println("1 - Soma")
            println("2 - Subtração")
            println("3 - Multiplicação")
            println("4 - Divisão")
            println("5 - Encerrar")
            val opc: Int = readLine()!!.toInt()

            when(opc){
                SOM -> println("\nA soma de $primeiroNum com $segundoNum é igual a: " + (primeiroNum+segundoNum))
                SUB -> println("\nA subtração de $primeiroNum por $segundoNum é igual a: " + (primeiroNum-segundoNum))
                MUL -> println("\nA multiplicação de $primeiroNum por $segundoNum é igual a: " + (primeiroNum*segundoNum))
                DIV -> println("\nA divisão de $primeiroNum por $segundoNum é igual a: " + (primeiroNum/segundoNum))
                        // Finaliza a aplicação
                ENC -> continua = false;
                else -> println("\nEntrada inválida!")
            }
        } else if(entrada.equals(0)){
            // Finaliza a aplicação
            continua = false;
        } else {
            println("Entrada inválida! Apenas 1 e 0 são permitidos!")
        }



    }

    println("\nCalculadora finalizada com sucesso!")

}