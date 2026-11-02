// runN accepts an integer, n, and a function to run n times

fun runN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

class Envelope(val letter: String, val address: Address, var hasStamp: Boolean = false)
data class Address(val street: String, val city: String, val state: String, val zipCode: Int) {
    override fun toString(): String {
       return "$street\n$city, $state $zipCode"
    }
}

fun main() {
    runN(5) {println("Hello World!")}

    val letter = "Hello World! I'm Zach!"
    val envelope = Envelope(letter, Address("123 Anywhere St", "Somewhere Ville", "NE", 12345), true)
    println("My envelope is going to:\n${envelope.address}")
}