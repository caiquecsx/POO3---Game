package Gear

object Staff : IGearStats {
	
	override var GearType: Weapons = Weapons.Staff
		get() = field
	
		override var atk: Int = 15
		get() = field
		set(value) {
			field = value
		}
	
	override var def: Int = 5
		get() = field
		set(value) {
			field = value
		}
	
	override fun getWeapon() {
		print("You have a Staff !")
	}
}