class Telefono() : DispositivoElectronico, EncendidoApagado {

    var estadoTelefono: Boolean = false

    override fun reiniciar(): String {
        return "Teléfono reiniciado"
    }

    override fun encender() {
        if (!estadoTelefono){
            estadoTelefono = true
            println("Teléfono encendido.")
        }else{
            println("El teléfono ya está encendido.")
        }
    }

    override fun apagar() {
        if (estadoTelefono){
            estadoTelefono = false
            println("Teléfono apagado.")
        }else{
            println("El teléfono ya está apagado.")
        }    }
}