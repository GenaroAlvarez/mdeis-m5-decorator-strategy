package kata7

class FooterDecorator(private val report: Report, private val footer: String) : Report {
    override fun generate(): String {
        return "${report.generate()}\nPie de página: $footer"
    }
}