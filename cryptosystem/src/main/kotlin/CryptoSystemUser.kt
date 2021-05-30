import java.math.BigInteger
import java.util.*

class CryptoSystemUser(name: String, sys: CryptoSystem) {
    private var usersName: String = name
    private var system: CryptoSystem = sys
    private var secretKey: BigInteger = BigInteger(2048, Random())
    private var publicKey: BigInteger = power(sys.g, secretKey, sys.p)

    fun communicate(other: CryptoSystemUser): BigInteger {
        return power(other.publicKey, secretKey, system.p)
    }

    override fun toString(): String {
        return "User: name = $usersName, secret key = $secretKey, public key = $publicKey"
    }
}