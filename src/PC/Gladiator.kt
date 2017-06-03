package PC

import java.util.Random
import Gear.IGearStats

object Gladiator : PlayableCharacter() {
	
	override val characterClass: characterClasses = characterClasses.Gladiator
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
	override var atk: Int = 20
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 15
		get() = field
		set(value) {
			field = value
		}
	
	override fun createCharacter(n: String, weapon: IGearStats) {
		println("Gladiator created")
		name = n
		weaponBonus(weapon)
		showStats()
	}
	

}