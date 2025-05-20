package kata7

class ReportGeneratorApp {
    fun generate() {
        val basicReport: Report = BasicReport("Datos de reporte")
        val basicReportWithHeader = HeaderDecorator(basicReport, "Reporte Anual")
        val basicReportWithHeaderAndFooter = FooterDecorator(basicReportWithHeader, "Página 1")
        val basicReportWithHeaderAndFooterAndWatermark =
            WatermarkDecorator(basicReportWithHeaderAndFooter, "Confidencial")

        println(basicReportWithHeaderAndFooterAndWatermark.generate())
    }
}