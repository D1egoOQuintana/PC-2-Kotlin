package com.quintana.luis.labcalificado02

fun main() {
    val agenda = Agenda()

    agenda.agregarContacto(Contacto("Juan Perez", "987654321", "juan.perez@mail.com"))
    agenda.agregarContacto(Contacto("Maria Lopez", "912345678", "maria.lopez@mail.com"))
    agenda.agregarContacto(Contacto("Ana Gomez", "999888777", "ana.gomez@mail.com"))

    agenda.listarContactos()

    agenda.buscarContactoPorNombre("Maria")
}
