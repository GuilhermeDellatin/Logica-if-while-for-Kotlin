import java.util.*

//* Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
    sabendo que o mesmo pode começar em um dia e terminar em outro,
    tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    print("Digite a hora inicial do jogo: ")
    val horaInicial = sc.nextInt()
    print("Digite a hora que o jogo acabou: ")
    val horaFinal = sc.nextInt()
    val duracao: Int

    if(horaInicial < horaFinal){
        duracao = horaFinal - horaInicial
    }
    else{
        duracao = 24 - horaInicial + horaFinal
    }

    println("O JOGO DUROU: ${duracao} HORAS(S)" )

    sc.close()
}