package Factories

import PC.PlayableCharacter
import PC.Gladiator
import PC.Mage
import PC.Knight
import PC.characterClasses

class FactoryPC {
	
	fun generateCharacter(charType : characterClasses): PlayableCharacter{
		when(charType) {
			characterClasses.Gladiator -> return Gladiator
			characterClasses.Mage -> return Mage
			characterClasses.Knight -> return Knight
		}
	}
}