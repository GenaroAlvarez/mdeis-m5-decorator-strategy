package kata9

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RoomDecoratorAppTest {

    @Test
    fun decorate() {
        val roomDecoratorApp = RoomDecoratorApp()
        roomDecoratorApp.decorate()
    }
}