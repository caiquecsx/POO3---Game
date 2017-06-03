import Factories.FactoryNPC
import NPC.typeNPC
import NPC.NonPlayableCharacter
import Factories.FactoryPC
import Factories.FactoryWeapon
import PC.PlayableCharacter
import kotlin.properties.Delegates
import Gear.IGearStats
import PC.characterClasses
import Gear.Weapons
import java.util.*

class Facade{
	var NPC: MutableList<NonPlayableCharacter> = mutableListOf<NonPlayableCharacter>()
	var character: PlayableCharacter by Delegates.notNull()
	
	fun instantiateNPCs() {
		val factoryNPC = FactoryNPC()
		
		println("\nFilling game with bots\n")
	
		for(i in 1..2){
			NPC.add(factoryNPC.getNPC(typeNPC.Dragon))
		}
		
		for(i in NPC.size..NPC.size+15){
			NPC.add(factoryNPC.getNPC(typeNPC.Vampire))
		}
		
		for(i in NPC.size..NPC.size+15){
			NPC.add(factoryNPC.getNPC(typeNPC.Werewolf))
		}
		
//		for(i in NPC){
//			i.generateNPC()
//		}
	}
	
	
	fun createCharacter(){
		val factoryPC = FactoryPC()
		val factoryWeapons = FactoryWeapon()
		val scan = Scanner(System.`in`)
	
		//var character: PlayableCharacter by Delegates.notNull()
		var weapon: IGearStats by Delegates.notNull()
	
		print("Please select your character class: \n(1)Gladiator \n(2)Mage \n(3)Knight \nChoose one: ")
		val s1 = scan.nextInt();
		
		when(s1){
			1 -> character = factoryPC.generateCharacter(characterClasses.Gladiator) 
			2 -> character = factoryPC.generateCharacter(characterClasses.Mage)
			3 -> character = factoryPC.generateCharacter(characterClasses.Knight)
		}
		
		println("Choose a name for you new character:")
		val name = scan.next()
		
		print("Please select your weapon: \n(1)Axe \n(2)Staff \n(3)Sword \n(4)Shield \nChoose one: ")
		val s2 = scan.nextInt();
		
	
		when(s2){
			1 -> weapon = factoryWeapons.generateWeapon(Weapons.Axe)
			2 -> weapon = factoryWeapons.generateWeapon(Weapons.Staff)
			3 -> weapon = factoryWeapons.generateWeapon(Weapons.Sword)
			4 -> weapon = factoryWeapons.generateWeapon(Weapons.Shield)
		}
		
		character.createCharacter(name,weapon)
	}

	fun playGame(){
//        var rand : Random = Random()
//        //Selection of an aleatory enemy
//        var enemy = NPC.get(rand.nextInt(32 - 1)+ 1)

        //Actions in game
		loop@ while(true){
			val scan = Scanner(System.`in`)
			menu()
			var opt = scan.nextInt()

			when(opt){
				1 -> {
                    attack()
				}
				2 -> {
					character.showStats()
				}
				else -> {
					println("Exiting")
					break@loop
				}
			}
		}
	}

	fun menu(){
		println("\n1 - Attack 2 - Your Stats")
	}

    //Character attacks
	fun attack(){
        var atk = character.attack()
        var def = NPC.get(1).deffend()

        println(character.name + " is attacking !")

        println("Damage inflicted: $atk")
        println(NPC.get(1).javaClass.simpleName +" defense inflicted: $def")

        if(def > atk)
            println("Miss !")
        else
            println("Effective !")

        println("\n- Next turn -\n")
        deffend()
	}

	fun deffend(){
        var atk = NPC.get(1).attack()
        var def = character.deffend()

        println(NPC.get(1).javaClass.simpleName + " is attacking !")

        println("Damage inflicted: $atk")
        println(character.name +" defense inflicted: $def")

        if(def > atk)
            println("Miss !")
        else
            println("Effective !")
	}

	fun NPCAttack(){
		println("Damage inflicted:" + NPC.get(1).attack())
	}

	fun NPCDeffend(){
		println("Defense inflicted:" + NPC.get(1).deffend())
	}
	
}
