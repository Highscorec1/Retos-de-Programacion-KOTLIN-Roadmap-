/* DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3. */

fun main() {
    
   
    for (i in 10..55){  
        if ( ( i % 2 == 0 &&  i != 16 && i % 3 != 0 ) || i == 55 ){    
            println(i)
        }        
    }
 
    println()
    println("While")

    
    var num = 10
    
    while(num <= 55){
        
        if ( ( num % 2 == 0 &&  num != 16 && num % 3 != 0 ) || num == 55 ){    
            println(num)
        }
        num++
    }
    
    
    
    
    var num1 = 10
    
    do {
        if ((num1 % 2 == 0 && num1 != 16 && num1 % 3 != 0) || num1 == 55) {
            println(num1)
        }
        num1++
    } while (num1 <= 55)
    
}


//https://pl.kotl.in/-PS7SC0fC