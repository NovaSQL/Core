package io.novasql.core

import io.novasql.api.NovaSQL
import io.novasql.api.NovaSQLConfig
import io.novasql.api.driver.Driver
import org.slf4j.LoggerFactory

class NovaSQLCore : NovaSQL() {
    companion object {
        @JvmStatic val logger = LoggerFactory.getLogger(NovaSQLCore::class.java)!!
        @JvmStatic val drivers = mutableMapOf<String, Driver>()



        @JvmStatic
        fun init(config: NovaSQLConfig) {
            instance = NovaSQLCore()

            drivers.forEach {
                logger.debug("Initializing driver: ${it.value.getName()}")
            }

            val driver = drivers[config.driver.lowercase()] ?: throw IllegalArgumentException("Driver ${config.driver} is not registered")

            logger.debug("Enabling driver: ${config.driver}")
            driver.onEnable()
        }

        @JvmStatic
        fun register(driver: Driver) {
            drivers[driver.getName().lowercase()] = driver
        }
    }
}