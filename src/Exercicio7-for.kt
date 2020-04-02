import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Fazer um programa para ler um número inteiro positivo N.
O programa deve então mostrar na tela N linhas, começando de 1 até N.
Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Digite um numero inteiro positivo N: ")
    val n = sc.nextInt()

    for(i: Int in 1..n){
        println("${i} ${i*i} ${i*i*i}")
    }
}