package Factories

import Gear.Weapons
import Gear.IGearStats
import Gear.Axe
import Gear.Sword
import Gear.Staff
import Gear.Shield

class FactoryWeapon {
	
	fun generateWeapon(weaponType: Weapons): IGearStats{
		when(weaponType) {
			Weapons.Axe -> return Axe
			Weapons.Sword -> return Sword
			Weapons.Staff -> return Staff
			Weapons.Shield -> return Shield
		}
	}
}