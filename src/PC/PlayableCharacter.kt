package PC
import PC.characterClasses

import Gear.IGearStats
import Gear.Weapons
import java.util.Random

public abstract class PlayableCharacter {
	abstract var name: String
	abstract var health: Int
	abstract var atk: Int
	abstract var def: Int
	abstract val characterClass: characterClasses
	
	abstract fun createCharacter(n: String, weapon: IGearStats)

	fun showStats(){
		println("\n$name stats: \nATK: $atk \nDEF: $def")
	}
	
	fun weaponBonus(weapon: IGearStats){
		weapon.getWeapon()
		
		when(characterClass){
			characterClasses.Gladiator -> when(weapon.GearType){
				Weapons.Axe -> {
					atk += 50
					def += 20
				}
				Weapons.Sword -> {
					atk += 25
					def += 5
				}
				Weapons.Staff -> {
					atk += 0
					def += 0
				}
				Weapons.Shield -> {
					atk += 5
					def += 10
				} 
			}
			
			characterClasses.Mage -> when(weapon.GearType){
				Weapons.Axe -> {
					atk += 0
					def += 0
				}
				Weapons.Sword -> {
					atk += 5
					def += 5
				}
				Weapons.Staff -> {
					atk += 45
					def += 25
				}
				Weapons.Shield -> {
					atk += 5
					def += 10
				} 
			}
			
			characterClasses.Knight -> when(weapon.GearType){
				Weapons.Axe -> {
					atk += 25
					def += 10
				}
				Weapons.Sword -> {
					atk += 55
					def += 25
				}
				Weapons.Staff -> {
					atk += 0
					def += 0
				}
				Weapons.Shield -> {
					atk += 5
					def += 15
				} 
			}
		}
	}

	fun attack(): Int{
		var rand : Random = Random()
		return (atk * (rand.nextInt(100 - 40)+ 40))/100
	}
	
	fun deffend(): Int{
		var rand : Random = Random()
		return (def * (rand.nextInt(100 - 40)+ 40))/100
	}
}