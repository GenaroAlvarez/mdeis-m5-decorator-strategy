package kata7

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReportGeneratorAppTest {

    @Test
    fun generate() {
        val reportGeneratorApp = ReportGeneratorApp()
        reportGeneratorApp.generate()
    }
}