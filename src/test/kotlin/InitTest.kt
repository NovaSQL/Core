
import io.novasql.api.NovaSQLConfig
import io.novasql.api.driver.Driver
import io.novasql.core.NovaSQLCore

fun main() {
    NovaSQLCore.register(TestDriver())
    NovaSQLCore.init(NovaSQLConfig("Test", "", -1, "", "", ""))
}

class TestDriver : Driver {
    override fun getName(): String = "Test"

    override fun getVersion(): String = "1.0.0"

    override fun onDisable() {
        TODO("Not yet implemented")
    }

    override fun onEnable() {
        TODO("Not yet implemented")
    }

    override fun onInitialize() {
        NovaSQLCore.logger.info("${getName()} ${getVersion()} initialized.")
    }

}