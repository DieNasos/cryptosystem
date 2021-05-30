/*
    This program models Diffie–Hellman key exchange.
    The Diffie – Hellman protocol is a cryptographic protocol
    that allows two or more parties to obtain a shared secret key
    sing an unprotected communication channel. The resulting key
    is used to encrypt further exchange using symmetric encryption algorithms.
 */

fun main() {
    val system = CryptoSystem()
    println(system)
    val alice = CryptoSystemUser("Alice", system)
    println(alice)
    val bob = CryptoSystemUser("Bob", system)
    println(bob)
    val claire = CryptoSystemUser("Claire", system)
    println(claire)
    connect(alice, bob)
    connect(alice, claire)
    connect(bob, claire)
}