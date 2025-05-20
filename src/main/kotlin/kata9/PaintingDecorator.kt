package kata9

class PaintingDecorator(private val room: Room) : Room {
    override fun decorate(): String {
        return room.decorate() + ", con cuadros"
    }
}