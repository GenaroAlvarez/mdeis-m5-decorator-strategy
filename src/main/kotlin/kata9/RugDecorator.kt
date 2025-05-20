package kata9

class RugDecorator(private val room: Room) : Room {
    override fun decorate(): String {
        return room.decorate() + ", con alfombra"
    }
}