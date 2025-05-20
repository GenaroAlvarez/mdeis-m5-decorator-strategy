package kata7

class WatermarkDecorator(private val report: Report, private val watermark: String) : Report {
    override fun generate(): String {
        return "${report.generate()}\nMarca de agua: $watermark"
    }
}