import moves.moveSpark;

public class pokemonEelektrik
			extends pokemonTynamo {
	public pokemonEelektrik(java.lang.String Name, int Level) {
		super(Name, Level);
		setStats(65, 85, 70, 75, 70, 40);
		addMove(new moveSpark());
	}

}
