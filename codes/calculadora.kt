fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readLine()?.toDoubleOrNull()

    print("Digite o segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull()

    if (numero1 == null || numero2 == null) {
        println("Erro: Entrada inválida.")
        return
    }

    println(
        """
        Escolha a operação:
        1 - Soma (+)
        2 - Subtração (-)
        3 - Multiplicação (*)
        4 - Divisão (/)
        """.trimIndent()
    )

    print("Digite o número da operação desejada: ")
    val opcao = readLine()

    val resultado = when (opcao) {
        "1" -> "Resultado da soma: ${numero1 + numero2}"
        "2" -> "Resultado da subtração: ${numero1 - numero2}"
        "3" -> "Resultado da multiplicação: ${numero1 * numero2}"
        "4" -> {
            if (numero2 == 0.0)
                "Erro: Divisão por zero não é permitida."
            else
                "Resultado da divisão: ${numero1 / numero2}"
        }
        else -> "Opção inválida."
    }

    println(resultado)
}
