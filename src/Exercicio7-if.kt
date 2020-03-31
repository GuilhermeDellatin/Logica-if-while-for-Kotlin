import java.util.*


//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir,
determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
 */


fun main(args: Array<String>){
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    print("Digite o valor do Eixo X: ")
    val x = sc.nextDouble()
    print("Digite o valor do Eixo Y: ")
    val y = sc.nextDouble()

    if(x == 0.0 && y == 0.0){
        print("Origem")
    }
    else if(x == 0.0){
        print("Eixo Y")
    }
    else if(y == 0.0){
        print("Eixo X")
    }
    else if(x > 0.0 && y > 0.0){
        print("Q1")
    }
    else if(x < 0.0 && y > 0.0){
        print("Q2")
    }
    else if(x < 0.0 && y < 0.0){
        print("Q3")
    }
    else{
        print("Q4")
    }

    sc.close()
}
