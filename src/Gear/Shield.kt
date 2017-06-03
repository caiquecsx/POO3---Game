package Gear

object Shield : IGearStats{
	
	override var GearType: Weapons = Weapons.Shield
		get() = field
	
	override var atk: Int = 5
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 15
		get() = field
		set(value) {
			field = value
		}
	
	override fun getWeapon() {
		println("You have a Shield !")
	}
}