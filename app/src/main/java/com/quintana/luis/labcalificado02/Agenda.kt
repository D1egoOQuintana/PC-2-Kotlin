package com.quintana.luis.labcalificado02

/**
 * Representa un contacto con información básica.
 */
data class Contacto(
    val nombre: String,
    val telefono: String,
    val email: String
)

/**
 * Agenda que maneja una lista de contactos, con funciones para agregar,
 * listar y buscar contactos por nombre.
 */
class Agenda {

    private val contactos = mutableListOf<Contacto>()

    /**
     * Agrega un contacto a la agenda.
     */
    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado: ${contacto.nombre}")
    }

    /**
     * Lista todos los contactos en la agenda.
     */
    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            println("Lista de contactos:")
            contactos.forEach { c ->
                println("Nombre: ${c.nombre}, Teléfono: ${c.telefono}, Email: ${c.email}")
            }
        }
    }

    /**
     * Busca contactos cuyo nombre contiene el texto dado, sin importar mayúsculas/minúsculas.
     */
    fun buscarContactoPorNombre(nombre: String) {
        val encontrados = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
        if (encontrados.isEmpty()) {
            println("No se encontró ningún contacto con el nombre \"$nombre\"")
        } else {
            println("Contactos encontrados con nombre \"$nombre\":")
            encontrados.forEach { c ->
                println("Nombre: ${c.nombre}, Teléfono: ${c.telefono}, Email: ${c.email}")
            }
        }
    }
}