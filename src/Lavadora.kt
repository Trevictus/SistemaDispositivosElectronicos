class Lavadora() : EncendidoApagado {
    var estadoLavadora: Boolean = false

    override fun encender() {
        if (!estadoLavadora) {
            println("La lavadora ya está encendida.")
        } else {
            estadoLavadora = true
            println("Lavadora encendida.")
        }
    }

    override fun apagar() {
        if (estadoLavadora){
            estadoLavadora = false
            println("Lavadora apagada.")
        }else{
            println("La lavadora ya está apagada.")
        }

    }


}