import java.util.*
import java.lang.*

class PrimeraClase {
    init {
        println("Primera Clase")
    }

    companion object {
        val c = PrimeraClase()
    }

    fun metodo(ejecucion: Int) {
        println("Metodo1($ejecucion)")
    }
}

class SegundaClase {
    val primera1 = PrimeraClase()

    init {
        println("Segunda Clase")
        primera1.metodo(10)
    }

    fun metodo(ejecucion: Int) {
        println("Metodo2($ejecucion)")
    }

    companion object {
        val primera2 = PrimeraClase()
        val segunda1 = SegundaClase()
    }
}

class TerceraClase {
    val primera3 = PrimeraClase()

    companion object {
        val primera4 = PrimeraClase()
        val primera5 = PrimeraClase()

        init {
            PrimeraClase()
            SegundaClase()
            TerceraClase()
        }
    }

    init {
        println("Tercera Clase")
        primera4.metodo(20)
    }

    fun metodo(ejecucion: Int) {
        println("Metodo3($ejecucion)")
    }
}

public class construccion {

    companion object {
        val segunda = SegundaClase()
        val tercera = TerceraClase()

        init {
            println("Static programa principal 1")
            segunda = SegundaClase()
            println("Static Programa principal 2")
            tercera = TerceraClase()
        }

        @JvmStatic
        fun main(args: Array<String>) {
            construccion()
            println("Programa Principal 1")
            TerceraClase()
            segunda.primera2.metodo(30)
            println("Programa Principal")
            TerceraClase()
            segunda.metodo(40)
            tercera.metodo(50)
        }
    }
}
