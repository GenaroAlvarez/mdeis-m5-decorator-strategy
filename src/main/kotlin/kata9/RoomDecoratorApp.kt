package kata9

class RoomDecoratorApp {
    fun decorate() {
        val basicRoom: Room = BasicRoom()
        println(basicRoom.decorate())

        val basicRoomWithCurtains = CurtainsDecorator(basicRoom)
        val basicRoomWithCurtainsAndRug = RugDecorator(basicRoomWithCurtains)
        val basicRoomWithCurtainsAndRugAndPainting = PaintingDecorator(basicRoomWithCurtainsAndRug)

        println(basicRoomWithCurtainsAndRugAndPainting.decorate())
    }
}