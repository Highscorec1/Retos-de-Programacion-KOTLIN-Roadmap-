val agenda = mutableMapOf("" to "")

fun main() {
    while (true) {
        println("=== AGENDA DE CONTACTOS ===")
        println("Selecciona una opción:")
        println("1. Insertar contacto")
        println("2. Buscar contacto")
        println("3. Actualizar contacto")
        println("4. Eliminar contacto")
        println("5. Salir")
        print("Opción: ")

        val opcion = readLine()
        when (opcion) {
            "1" -> { println("Has seleccionado: Insertar contacto")
            println("Introduce el nombre: ")
                val nombre = readLine() ?: ""
            println("Ingresa el numero")
                val numero = readLine() ?: ""

                agenda [nombre] = numero
            }
            "2" -> { println("Has seleccionado: Buscar contacto")

                    println("Buscar Contacto: ")
                    print("Introduce el nombre a buscar: ")
                    val nombre = readLine() ?: ""

                    if (agenda.containsKey(nombre)){
                        println("$nombre: ${agenda[nombre]}")
                    } else {
                        println("Contacto no encontrado.")
                    }


            }
            "3" -> {
                    println("Has seleccionado: Actualizar contacto")

                    print("Ingresa el contacto a buscar: ")
                    val nombre = readLine() ?: ""

                    if (agenda.containsKey(nombre)) {

                        agenda[nombre] = readLine() ?: ""


                    } else {
                        println("Contacto no encontrado.")
                    }
            }

            "4" -> {
                println("Has seleccionado: Eliminar contacto")
                print("Nombre del Contacto a borrar: ")
                val nombre = readLine() ?: ""

                agenda.remove(nombre)


            }
            "5" -> {
                println("¡Hasta luego!")
                break
            }
            else -> println("Opción no válida. Intenta de nuevo.")
        }

        println() // Línea en blanco para separar iteraciones
    }
}


