package PC

import Gear.IGearStats

object Knight: PlayableCharacter() {

	override val characterClass: characterClasses = characterClasses.Knight
		get() = field
	
	override var name: String = ""
		get() = field
		set(value) {
			field = value
		}

	override var health: Int = 200
		get() = field
		set(value) {
			field = value
		}
		
	//setted the default stats
	override var atk: Int = 15
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 10
		get() = field
		set(value) {
			field = value
		}
	
	override fun createCharacter(n: String, weapon: IGearStats) {
		println("Knight created")
		name = n
		weaponBonus(weapon)
		showStats()
	}

}