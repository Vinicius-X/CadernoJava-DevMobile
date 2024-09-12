fun main() {
  println("Olá, qual é seu nome?")
  var nome: String = readLine()!!
  println("Seja bem Vindo ")     
  println(nome)
  println("Qual Sua Idade?")
  var idade: String = readline()!!
  var idadeint: Int = 0
  idadeint = idade.toInt()
  println("Sua idade é:")
  println(idade)

}