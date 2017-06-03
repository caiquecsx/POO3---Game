package NPC

object Vampire : NonPlayableCharacter() {
	override fun generateNPC() {
		println("New Vampire Created")
	}
	
	override var health: Int = 250
		get() = field
		set(value) {
			field = value
		}

	override var atk: Int = 35
		get() = field
		set(value) {
			field = value
		}
	override var def: Int = 30
		get() = field
		set(value) {
			field = value
		}
}