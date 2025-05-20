package kata7

class HeaderDecorator(private val report: Report, private val header: String) : Report {
    override fun generate(): String {
        return "Encabezado: $header\n${report.generate()}"
    }
}