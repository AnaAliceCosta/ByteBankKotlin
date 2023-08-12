fun main() {

    val contaAna = Conta(1,"Ana")

    contaAna.depoisita(10000.0)

    println(contaAna.titular)
    println(contaAna.numero)
    println(contaAna.saldo)

    val contaAlex = Conta(2,"Alex")



    contaAlex.depoisita(100.0)

    println("saldo da conta do alex ${contaAlex.saldo}")
    println("Depositando na conta do alex")
    contaAlex.depoisita(50.0)

    contaAlex.saca(55.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


}


class Conta() {

    var titular = ""
        private set
    var numero = 0
        private set
    var saldo = 0.0
        private set(valor) {
            if (valor >= 0) {
                field += valor
            }
        }

    constructor(numero : Int, titular : String){
        this.numero = numero
        this.titular = titular
    }

    fun depoisita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfre(contaDestino: Conta, valor: Double) {


    }


}


fun testaLacos() {
    for (i in 5 downTo 1 step 2) {
        println(i)
        println("BiteBank te dá as boas vindas")
        val titular = "Ana $i"
        var numeroConta = 1000
        var saldo = 100.0

        saldo += i
        numeroConta += i

        println("titular $titular")
        println("numero da conta: $numeroConta")
        println("saldo da conta $saldo")


    }

}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("Conta é negativa")

    }
}