import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

                       Tabela
          Codigo    Especificação   Preço
            1      Cachorro Quente  R$4.00
            2       X-Salada        R$4.50
            3       X-Bacon         R$5.00
            4      Torrada Simples  R$2.00
            5       Refrigerante    R$1.50
*/

fun main(args: Array<String>){
    Locale.setDefault(Locale.US)

    val sc = Scanner(System.`in`)

    print("Com base na tabela digite o código do item desejado: ")
    val codigo = sc.nextInt()
    print("Digite a quantidade que deseja do respectivo item: ")
    val quantidade = sc.nextInt()

    val total: Double

    if(codigo == 1){
        total = quantidade * 4.0
        print("O total a pagar é: ${"%.2f".format(total)}")
    }
    else if(codigo == 2){
        total = quantidade * 4.50
        print("O total a pagar é: ${"%.2f".format(total)}")
    }
    else if(codigo == 3){
        total = quantidade * 5.00
        print("O total a pagar é: ${"%.2f".format(total)}")
    }
    else if(codigo == 4){
        total = quantidade * 2.00
        print("O total a pagar é: ${"%.2f".format(total)}")
    }
    else if(codigo == 5){
        total = quantidade * 1.50
        print("O total a pagar é: ${"%.2f".format(total)}")
    }
    else{
        print("Código inválido")
    }

    sc.close()
}

