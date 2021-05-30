import java.math.BigInteger

fun power(base: BigInteger, exp: BigInteger, modulo: BigInteger): BigInteger {
    var b = base
    var result = BigInteger("1")
    for (i in 0 until exp.bitLength()) {
        if (exp.testBit(i)) {
            result *= b
            result %= modulo
        }
        b *= b
        b %= modulo
    }
    return result
}

fun connect(first: CryptoSystemUser, second: CryptoSystemUser) {
    val firstSecond = first.communicate(second)
    val secondFirst = second.communicate(first)
    println(
        if (firstSecond == secondFirst) "Connected successfully!"
        else "ERROR :: could not connect users!"
    )
}