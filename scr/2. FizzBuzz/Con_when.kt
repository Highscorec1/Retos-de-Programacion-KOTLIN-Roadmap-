// DIFICULTAD EXTRA (opcional):
//  Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
//  La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
//   Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
//   Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
//   Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
//   La función retorna el número de veces que se ha impreso el número en lugar de los textos.
//   
fun main(){

    val valorRetornado = funcionReci("fizz", "buzz")

    println("El valor del contador que retornamos de la función la veces que solo se imprimio un numero es $valorRetornado")
    
}


fun funcionReci( nombre1: String? = "", nombre2: String? = ""): Int{
    
    var contador = 0
    
    for (num in 1..100){
       
        
         
        when{
            num % 5 == 0 && num % 3 == 0 -> println(nombre1 + " " + nombre2)
            num % 3 == 0 -> println(nombre1)
            num % 5 == 0 -> println(nombre2)
        
        	else -> { println(num)
            			contador++ }
        
        
        
        }
        
        
        
    }
    
    return contador
}
    
    
