// DIFICULTAD EXTRA (opcional):
//  Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
//  La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
//   Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
//   Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
//   Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
//   La función retorna el número de veces que se ha impreso el número en lugar de los textos.

fun main(){    
    
    val valorRetornado = numret("Fizz", "Buzz") 

    println("Número de veces que se imprimió un número: $valorRetornado")  // Mostramos el conteo al final  


}

fun numret(texto1: String? = null, texto2: String? = null):Int {
    
    	var conteo = 0
    
    
    println("numeros: ")

    for (num in 1..100) {       
        
        if (num % 5 == 0 && num % 3 == 0) {
            
            println(texto1 + " " + texto2)
       		
   	} else if (num % 5 == 0) {
        
        	println(texto2)
        
        }else if (num % 3 == 0) {
            
            println(texto1)
           
        }else {
            println(num)
       		 conteo++      
        }
         
    }    
         
 return conteo  
    
}