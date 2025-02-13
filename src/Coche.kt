class Coche(override var motorEncendido: Boolean = false, override var kmHora: Int) : EncendidoApagado, Vehiculo {
    override fun encender() {
        if (motorEncendido) {
            println("El motor ya está encendido.")
        } else {
            motorEncendido = true
            println("Arrancando el motor.")
        }
    }

    override fun apagar() {
        if (motorEncendido) {
            motorEncendido = false
            println("Motor apagada.")
        } else {
            println("El coche ya está apagado.")
        }
    }

    override fun acelerar(km: Int) {
        if (motorEncendido) {
            kmHora += km
        }else{
            println("No puedes acelerar con el motor apagado.")
        }
    }

    override fun frenar(km: Int) {
        if (motorEncendido) {
            if(kmHora - km < 0){
                kmHora = 0
                println("El coche ha frenado por completo.")
            }else{
                kmHora -= km
                println("El coche ha decelerado.")
            }
        }else{
            println("El coche está parado, no puede frenar.")
        }
    }
}