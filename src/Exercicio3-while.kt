import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).
O programa será encerrado quando o código informado for o número 4.
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Digite um codigo: ")
    var codigo = sc.nextInt()
    var Alcool = 0
    var Gasolina = 0
    var Diesel = 0
    while(codigo != 4){
        when{
            (codigo == 1) -> Alcool++
            (codigo == 2) -> Gasolina++
            (codigo == 3) -> Diesel++
        }
        codigo = sc.nextInt()
    }
    println("Muito Obrigado \nAlcool: ${Alcool} \nGasolina: ${Gasolina} \nDiesel: ${Diesel}")
    sc.close()
}