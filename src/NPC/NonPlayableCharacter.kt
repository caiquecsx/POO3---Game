package NPC

import java.util.Random

abstract class NonPlayableCharacter {
	abstract var health: Int
	abstract var atk: Int
	abstract var def: Int
	
	abstract fun generateNPC()
	
	fun attack(): Int{
		var rand : Random = Random()
		return (atk * (rand.nextInt(100 - 40)+ 40))/100
	}
	
	fun deffend(): Int{
		var rand : Random = Random()
		return (def * (rand.nextInt(100 - 40)+ 40))/100
	}

}