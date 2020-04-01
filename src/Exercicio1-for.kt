import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso.
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Digite o valor de X: ")
    val x = sc.nextInt()
    if(x >= 1 && x <= 1000) {
        for (i: Int in 1..x) {
            if(i % 2 != 0){
                println("${i}")
            }
        }
    }
    else{
        print("Digite um valor entre 1 e 1000")
    }
    sc.close()
}