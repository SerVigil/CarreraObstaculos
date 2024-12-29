//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val acciones =  arrayOf("correr", "correr", "saltar", "saltar", "correr")
    //"correr", "saltar", "correr", "saltar", "correr" y "_|_|_"
    //"correr", "correr", "correr", "saltar", "correr" y "_|_|_"
    //"correr", "correr", "saltar", "saltar", "correr" y "_|_|_"
    //["correr", "correr", "saltar", "saltar", "correr"] y "_|_|_|_"
    //["correr", "saltar", "correr", "saltar"] y "_|_|_"
    //["correr", "saltar", "correr", "saltar", "correr", "saltar", "correr"] y "_|_|_"
    //["saltar", "saltar", "saltar", "saltar", "saltar"] y "|||||"
    //["saltar", "saltar", "saltar", "saltar", "saltar"] y "||_||"
    val pista = "_|_|_|_"
    carreraObstaculos(acciones, pista)
}


fun carreraObstaculos(acciones: Array<String>, pista: String){

    var estaBien: Boolean = true
    for(i in acciones.indices){
        val accion = acciones[i]
        val obstaculo = pista[i]

        when {
            accion == "correr" && obstaculo == '_' -> println("0")
            accion == "saltar" && obstaculo == '|' -> println("0")
            accion == "correr" && obstaculo == '|' -> {
                estaBien = false
                println("/")
            }

            accion == "saltar" && obstaculo == '_' -> {
                estaBien = false
                println("x")
            }

            else -> {
                estaBien = false
                println("?")
            }
        }
    }
    if(estaBien)
    {
        println("La carrera ha sido superada")
    }
    else
    {
        println("La carrera no ha sido superada")
    }
  }



