import kotlin.system.exitProcess
var saldo = 100.5
val senha = 3589
var nome = ""

fun main() {
    print("Informe seu nome:")
    nome = readLine()!!

    inicio()
}

    fun inicio() {

        print("\nOlá, $nome, é um prazer ter você aqui!\n")
        print("Escolha uma opção:\n")
        print("1 - Ver saldo\n")
        print("2 - Ver extrato\n")
        print("3 - Fazer saque\n")
        print("4 - Fazer depósito\n")
        print("5 - Fazer transferência\n")
        print("6 - Sair\n")
        print("Sua escolha: ")
        val escolha = readLine()?.toIntOrNull()


        when (escolha) {
            1 -> verSaldo()
            2 -> verextrato()
            3 -> fazerSaque()
            4 -> fazerDeposito()
            5 -> fazertransferencia()
            6 -> sair()
            else -> erro()
        }
    }


    fun verSaldo() {
               senha()
        print("Seu saldo atual é: $saldo \n")

               inicio()
    }

    fun verextrato() {
    senha()

    print("Seu Extrato\n")
    println("Data: 20/08/2026 ")
    println("Saldo inicial: R$100,00")
    println("Depósito: + R$50,00")
    println("Saque: - R$30,00")
    println("Saldo atual: R$120,00\n")
        inicio()
}

    fun fazerSaque() {
    senha()

    while (true) {

        print("Qual o valor para saque? ")
        val saque = readLine()?.toFloatOrNull()


        if (saque == null || saque <= 0) {
            print("Por favor, informe um número válido.\n")
            fazerSaque()

        }

        else if (saque <= saldo) {
            saldo -= saque
            print("Saque realizado com sucesso!\n")
            print("Seu saldo atual é: $saldo \n")

            inicio()
        }

        else {
            print("Operação não autorizada.\n")
        }
              inicio()
    }
}

    fun fazerDeposito() {
        senha()

        while (true) {

            print("Qual o valor para depósito? ")
            val deposito = readLine()?.toFloatOrNull()


            if (deposito == null || deposito <= 0) {
                println("Por favor, informe um número válido.\n")
            }

            else if (deposito <= saldo) {
                saldo += deposito
                print("Deposito realizado com sucesso!\n")
                inicio()

            }

            else {
                println("Operação não autorizada.\n")
            }
        }
    }

    fun fazertransferencia() {
              senha()

    while (true) {

        println("Qual o contato deseja tranferir? ")
        val contato = readln().toIntOrNull()

        print("Qual o valor para a transferência? ")
        val transferencia = readLine()?.toFloatOrNull()


        if (transferencia == null || transferencia <= 0) {
            println("Por favor, informe um número válido.\n")
        }

        else if (transferencia <= saldo) {
            saldo -= transferencia
            print("Transferência realizada com sucesso!\n")
            print("Seu saldo atual é: $saldo \n")

            inicio()
        }

        else {
            println("Operação não autorizada.\n")
        }
    }
}

    fun erro() {
        print("Por favor, informe um número entre 1 a 6.")
        inicio()

    }

    fun senha() {

        while (true) {

            print("Digite a senha: ")
            val senhaDigitada = readln().toIntOrNull()

            if (senhaDigitada == senha) {

                println("Senha correta!\n")
                break
            }

            else {
                println("Senha incorreta!\n")
            }
        }
    }

    fun sair() {

        print("Você deseja sair? (S/N)")
        val confirma = readln().uppercase()

        print(" foi um prazer ter você por aqui!\n")
        print("\n")

        when (confirma) {
            "S" -> exitProcess(0)
            "N" -> inicio()
        }

    }
