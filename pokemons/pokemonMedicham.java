package pokemons;

import moves.moveZenHeadbutt;

public class pokemonMedicham
			extends pokemonMeditite {
	public pokemonMedicham( java.lang.String Name, int Level ) {
		super(Name, Level);
		setStats(60, 60, 75, 60, 75, 80);
		addMove(new moveZenHeadbutt());
	}
}
