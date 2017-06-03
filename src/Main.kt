fun main(args: Array<String>) {	
	val facade = Facade()

    facade.createCharacter()
    facade.instantiateNPCs()

    facade.playGame()
}
