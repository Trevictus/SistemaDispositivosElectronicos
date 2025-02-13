interface Vehiculo {

    val motorEncendido: Boolean
    val kmHora: Int

    fun acelerar(km: Int)

    fun frenar(km: Int)


}