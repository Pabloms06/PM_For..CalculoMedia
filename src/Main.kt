

fun main() {

    var lista = listOf(Gato(2), Perro(20), Persona(89),Gato(3), Perro(15), Persona(79),Gato(3), Perro(25), Persona(99))


    // Haz un ejercicio como output tenga:
    // El peso medio de los gatos es:
    // El peso medio de los perros es:
    // El peso medio de las personas es:
    var countPersonas = 0
    var pesoPersonas = 0

    var countPerros = 0
    var pesoPerros = 0

    var countGatos = 0
    var pesoGatos = 0

    lista.forEach{

        when(it){
            is Persona -> {
                countPersonas++
                pesoPersonas += it.peso
            }
            is Perro -> {
                countPerros++
                pesoPerros += it.peso
            }
            is Gato -> {
                countGatos++
                pesoGatos += it.peso
            }
        }
    }

    println("El peso de medio de las personas es = ${pesoPersonas / countPersonas}")
    println("El peso de medio de los gatos es = ${pesoGatos / countGatos}")
    println("El peso de medio de los perros es = ${pesoPerros / countPerros}")

}