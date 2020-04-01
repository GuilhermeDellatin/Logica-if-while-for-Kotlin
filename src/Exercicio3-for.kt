import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores,
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 */

fun main(args: Array<String>){
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    print("Digite a quantidade de medias que deseja calcular: ")
    val n = sc.nextInt()
    for(i in 1..n){
        print("Digite os ${n} valores para calcular a media: ")
        val n1 = sc.nextDouble()
        val n2 = sc.nextDouble()
        val n3 = sc.nextDouble()

        val media = ((n1 * 2) + (n2 * 3) + (n3 * 5))/10
        println("%.1f".format(media))
    }

    sc.close()
}