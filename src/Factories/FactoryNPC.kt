package Factories

import Gear.IGearStats
import Gear.Weapons
import Gear.Axe
import NPC.typeNPC
import NPC.NonPlayableCharacter
import NPC.Dragon
import NPC.Vampire
import NPC.Werewolf

class FactoryNPC {
	
	fun getNPC(charType : typeNPC): NonPlayableCharacter{
		when(charType) {
			typeNPC.Dragon -> return Dragon
			typeNPC.Werewolf -> return Werewolf
			typeNPC.Vampire -> return Vampire
			
		}
	}
}