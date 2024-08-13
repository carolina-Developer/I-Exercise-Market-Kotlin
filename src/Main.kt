//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDateTime
fun main() {

    val datetime = LocalDateTime.now()
    var keyboard:Int=0
    var flag = true
    var cantidad = 0
    var totalSinIva = 0
    var total = 0
    var totalFinal = 28640

    var mouse = 25000
    var teclado = 76000
    var monitor = 780000
    var usb = 52000
    var discoDuro = 230000

    var cantMouse = 0
    var cantTeclado = 0
    var cantMonitor = 0
    var cantUsb = 0
    var cantDiscoDuro = 0

    var nombre: String
    println("Por favor digite su nombre")
    nombre = readln().toString()


    while (flag){
        println("Digite que quiere comprar\n1. Mouse \n2.Teclado \n3. Monitor \n4. Usb \n5.Disco duro \n6.Facturar")
        keyboard = readln().toInt()
        when(keyboard){
            1 -> {
                total = total + mouse
                cantMouse++


            }
            2 -> {
                total = total + teclado
                cantTeclado++

            }
            3 -> {
                total = total + monitor
                cantMonitor++

            }
            4 -> {
                total = total + usb
                cantUsb++

            }
            5 -> {
                total = total + discoDuro
                cantDiscoDuro++

            }
            6 -> {

                println("Tienda pastas la muñeca" +
                        "\nCliente: $nombre" +
                        "\nNit: 11111111111" +
                        "\nFecha: $datetime" +
                        "\n1. Mouse: $mouse Cantidad: $cantMouse v/Total: ${(mouse*cantMouse)}" +
                        "\n2. Teclado: $teclado Cantidad: $cantTeclado v/Total: ${(teclado*cantTeclado)}" +
                        "\n3. Monitor: $monitor Cantidad: $cantMonitor v/Total: ${(monitor*cantMonitor)}" +
                        "\n4. Usb: $usb Cantidad: $cantUsb v/Total: ${(usb*cantUsb)}" +
                        "\n5. Disco duro: $discoDuro Cantidad: $cantDiscoDuro v/Total: ${(discoDuro*cantDiscoDuro)}" +
                        "\nTotal: ${(total+totalFinal)}")
                flag = false
                break
            }

        }
    }

}