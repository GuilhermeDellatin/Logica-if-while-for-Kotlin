import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

fun main(args: Array<String>){

    val sc = Scanner(System.`in`)

    print("Digite um número para verificar se é positivo ou negativo: ")
    val numero = sc.nextInt()

    if(numero > 0 || numero == 0){
        println("O número ${numero} não é negativo")
    }
    else{
        println("O número ${numero} é Negativo")
    }

    sc.close()
}