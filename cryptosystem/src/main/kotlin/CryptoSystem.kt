import java.math.BigInteger
import java.util.*

class CryptoSystem {
    val p = getRandomPrimeNumber()
    val g = getPrimitiveRootModulo(p)

    private fun getRandomPrimeNumber(): BigInteger
            = BigInteger.probablePrime(2048, Random())

    private fun getPrimitiveRootModulo(modulo: BigInteger): BigInteger {
        // s = (modulo - 1) / 2
        var s = modulo - BigInteger("1")
        s /= BigInteger("2")

        // t = modulo - 1
        var t = modulo - BigInteger("1")

        for (i in 0..9) {
            t--

            if (power(t, s, p) != BigInteger("1")) {
                return t
            }
        }

        throw PrimitiveRootCalculationException("Could not count primitive root modulo $modulo")
    }

    override fun toString(): String {
        return "System: p = $p, g = $g"
    }
}