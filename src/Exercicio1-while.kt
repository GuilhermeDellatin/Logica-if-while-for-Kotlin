import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
Considere que a senha correta é o valor 2002.
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Digite a senha: ")
    var senha = sc.nextInt()
    while (senha != 2002){
        println("Senha Invalida")
        print("Digite a senha novamente!:")
        senha = sc.nextInt()
    }
    print("Acesso Permitido")

    sc.close()
}