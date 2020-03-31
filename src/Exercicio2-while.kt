import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
Para cada ponto escrever o quadrante a que ele pertence.
O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    print("Digite a coordenada X: ")
    var x = sc.nextInt()
    print("Digite a coordenada Y: ")
    var y = sc.nextInt()

    while(x != 0 && y != 0){
        when{
            (x > 0 && y > 0) -> println("primeiro")
            (x < 0 && y > 0) -> println("segundo")
            (x < 0 && y < 0) -> println("terceiro")
            else -> println("quarto")
        }
        print("Digite a coordenada X: ")
        x = sc.nextInt()
        print("Digite a coordenada Y: ")
        y = sc.nextInt()
    }

    sc.close()
}