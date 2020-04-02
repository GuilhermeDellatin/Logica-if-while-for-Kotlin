import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

fun main(args: Array<String>){
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    print("Digite um numero N: ")
    val n = sc.nextInt()
    //var divisao: Double
    for(i in 1..n){
        println("Digite o primeiro numero: ")
        var n1 = sc.nextInt()
        println("Digite o segundo numero: ")
        var n2 = sc.nextInt()
        var divisao: Double

        divisao = (n1.toDouble() / n2.toDouble())
        when{
            (n2 == 0) ->print("Divisão impossivel")
            else -> print("${"%.1f".format(divisao)}")
        }

    }
    sc.close()
}