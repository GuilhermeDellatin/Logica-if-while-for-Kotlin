import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
 Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 */

/*
//Resolução usando função
fun Multiplos(A : Int, B: Int) {
    if(A % B  == 0 || B % A == 0){
        print("OS numeros ${A} e ${B} são múltiplos")
    }
    else{
        print("OS numeros ${A} e ${B} não são múltiplos")
    }
}

fun main(args: Array<String>){
    val sc  = Scanner(System.`in`)

    print("Digite o valor do primeiro número: ")
    val A = sc.nextInt()
    print("Digite o valor do segundo número: ")
    val B = sc.nextInt()
    Multiplos(A, B)

    sc.close()
}
*/

fun main(args: Array<String>){
    val sc  = Scanner(System.`in`)

    print("Digite o valor do primeiro número: ")
    val A = sc.nextInt()
    print("Digite o valor do segundo número: ")
    val B = sc.nextInt()

    if(A % B == 0 || B % A == 0){
        print("OS numeros ${A} e ${B} são múltiplos")
    }
    else{
        print("OS numeros ${A} e ${B} não são múltiplos")
    }

    sc.close()
}
