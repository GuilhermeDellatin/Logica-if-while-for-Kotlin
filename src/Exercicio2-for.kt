import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    print("Digite um valor inteiro N: ")
    val n = sc.nextInt()
    var iN = 0
    var out = 0

    for(i: Int in 1..n){
        val x = sc.nextInt()
        if(x >= 10 &&  x <= 20){
            iN++
        }
        else{
            out++
        }
    }
    println("${iN} in")
    println("${out} out")

    sc.close()
}