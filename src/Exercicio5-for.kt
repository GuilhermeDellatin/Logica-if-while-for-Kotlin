import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Digite um valor para calcular seu fatorial: ")
    val n = sc.nextInt()
    var fatorial: Long = 1

    for(i in 1..n){
        fatorial *= i.toLong()
    }
    print("${fatorial}")

    sc.close()
}