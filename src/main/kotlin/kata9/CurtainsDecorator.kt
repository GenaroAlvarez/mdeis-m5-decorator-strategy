package kata9

class CurtainsDecorator(private val room: Room) : Room {
    override fun decorate(): String {
        return room.decorate() + ", con cortinas"
    }
}