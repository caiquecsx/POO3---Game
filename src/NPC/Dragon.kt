package NPC

object Dragon: NonPlayableCharacter() {
	override fun generateNPC() {
		println("New Dragon Created")
	}
	
	override var health: Int = 400
		get() = field
		set(value) {
			field = value
		}
	
	override var atk: Int = 90
		get() = field
		set(value) {
			field = value
		}
	override var def: Int = 80
		get() = field
		set(value) {
			field = value
		}
	
	
}