import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Ler um número inteiro N e calcular todos os seus divisores.
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Digite um numero inteiro qualquer para mostrar seus divisores: ")
    val n = sc.nextInt()
    for(i in 1..n){
        if(n % i == 0){
            println("${i}")
        }
    }
    sc.close()
}