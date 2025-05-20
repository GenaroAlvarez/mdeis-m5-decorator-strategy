package kata7

class BasicReport(private val content: String) : Report {
    override fun generate(): String {
        return "Contenido: $content"
    }
}