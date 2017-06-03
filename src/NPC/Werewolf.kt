package NPC

object Werewolf : NonPlayableCharacter() {
	override fun generateNPC() {
		println("New Werewof Created")
	}
	
	override var health: Int = 250
		get() = field
		set(value) {
			field = value
		}

	override var atk: Int = 45
		get() = field
		set(value) {
			field = value
		}
	override var def: Int = 40
		get() = field
		set(value) {
			field = value
		}

}