import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

fun main(args: Array<String>){

    val sc = Scanner(System.`in`)

    print("Digite um número para verificar se é par ou impar: ")
    val numero = sc.nextInt()

    if(numero % 2 == 0 || numero == 0){
        println("O número ${numero} É PAR")
    }
    else{
        println("O número ${numero} é IMPAR")
    }

    sc.close()
}