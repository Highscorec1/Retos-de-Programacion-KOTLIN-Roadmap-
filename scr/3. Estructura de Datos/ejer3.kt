/* DIFICULTAD EXTRA (opcional):
* Crea una agenda de contactos por terminal.
* - Debes implementar funcionalidades de búsqueda, inserción, actualización
*   y eliminación de contactos.
* - Cada contacto debe tener un nombre y un número de teléfono.
* - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
*   y a continuación los datos necesarios para llevarla a cabo.
* - El programa no puede dejar introducir números de teléfono no numéricos y con más
*   de 11 dígitos (o el número de dígitos que quieras).
* - También se debe proponer una operación de finalización del programa.
*
* Resolucion 1. una interface que acepte que ingrese valores
*
*/
val agenda = mutableMapOf<String, String>()

fun main() {

    while (true) {
        println("AGENDA CONTACTOS")
        println("Selecciona una opcion:")
        println("1. Crear Contacto")
        println("2. Buscar Contacto")
        println("3. Actualizar Contacto")
        println("4. Eliminar Contacto")
        println("5. Salir")

        print("Opcion: ")

        val opcion = readLine()

        when (opcion) {

            "1" -> {
                println("seleccionaste Agregar Contacto")
                print("Ingresa el nombre: ")
                val nombre = readLine() ?: ""
                print("Ingresa el numero: ")
                val numero = readLine() ?: ""

                if(validarNumero(numero)){
                    agenda[nombre] = numero
                    println("Se agrego correctamente")

                } else {

                    println("Numero ingresado no valido, menos de 11 caracteres y solo numeros")

                }

            }

            "2" -> {
                println("seleccionaste 2")
                println("Ingresa el nombre: ")
                val nombre = readLine() ?: ""
                if (agenda.containsKey(nombre)) {
                    println("$nombre =  ${agenda[nombre]}")
                } else {
                    println("no existe")
                }
            }

            "3" -> {
                println("seleccionaste 3 actualizar")
                println("Ingresa el nombre del contacto a actualizar: ")
                val nombre = readLine() ?: ""

		
                if (agenda.containsKey(nombre)) {

                    val numero = readLine() ?: ""

		    if(validarNumero(numero)){
                    	 agenda[nombre] = numero
                    	 println("Se actualizado correctamente")

               		 } else {

                    	println("Numero ingresado no valido, menos de 11 caracteres y solo numeros")

               		 }


                } else {

                    println("no existe")
                }

            }

            "4" -> {
                println("seleccionaste 4")
                println("Ingresa el nombre del contacto a borrar: ")

                val nombre = readLine() ?: ""
                agenda.remove(nombre)

            }

            "5" -> {println("seleccionaste Salir")
                println("Adios!")
                break

            }


        }

        println()

    }
}

fun validarNumero(numero: String): Boolean {

    if(numero.length > 11 || numero.isEmpty()) return false

    for (i in numero){
        if(i < '0' || i > '9'){
            return false
        }
    }

    return true
}

