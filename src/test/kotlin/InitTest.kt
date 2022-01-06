
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

    override fun onInitialize() {
        NovaSQLCore.logger.debug("${getName()} ${getVersion()} initialized.")
    }

    override fun onEnable() {
        NovaSQLCore.logger.debug("${getName()} ${getVersion()} enabled.")
    }

    override fun onDisable() {
        NovaSQLCore.logger.debug("${getName()} ${getVersion()} disabled.")
    }
}