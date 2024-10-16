fun main() {
  println("Digite Um Número Intero")
var num1:Int=readLine()?.toIntOrNull()?:0
  println("Digite Outro Número Inteiro:")
var num2:Int=readLine()?.toIntOrNull()?:0
var result= num1+num2
  println("A soma é: $result")

var sub:Int= num1-num2
  println("A subtração é: $sub")

var mult:Int= num1*num2
  println("A multiplicação é: $mult")

var div:Int= num1/num2
  println("A divisão é: $div")
}