import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
    Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo
    em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
    Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */


fun main(args: Array<String>){

    Locale.setDefault(Locale.US)

    val sc = Scanner(System.`in`)

    print("Digite um valor qualquer para verificar qual seu intervalo entre 0 e 100: ")
    val valor = sc.nextDouble()

    if(valor < 0.0 || valor > 100.0){
        print("Valor fora de Intervalo")
    }
    else if(valor <= 25.0){
        print("Intervalo (0,25)")
    }
    else if(valor <= 50.0){
        print("Intervalo (25,50)")
    }
    else if(valor <= 75.0){
        print("Intervalo (50,75)")
    }
    else{
        print("Intervalo (75,100)")
    }

    sc.close()
}

/*
    Solução mais eficaz e elegante, porém sai do propósito da lista de exercicios que é pra ser resolvida usando if

fun main(args: Array<String>){
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    print("Digite um valor qualquer para verificar qual seu intervalo entre 0 e 100: ")
    val valor = sc.nextDouble()

    when{
        valor < 0.0 || valor > 100.0 -> print("Valor fora de Intervalo")
        valor <= 25.0 -> print("Intervalo (0,25)")
        valor <= 50.0 -> print("Intervalo (25,50)")
        valor <= 75.0 -> print("Intervalo (50,75)")
        else -> print("Intervalo (75,100)")
    }

    sc.close()
}

 */