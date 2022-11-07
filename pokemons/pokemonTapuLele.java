package pokemons;

import moves.moveDoubleTeam;
import moves.moveThunderShock;
import moves.moveThunderWave;
import moves.moveThunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class pokemonTapuLele
			extends Pokemon {
	public pokemonTapuLele( java.lang.String Name, int Level ) {
		super(Name, Level);
		setStats(70, 80, 75, 130, 115, 95);
		setType(Type.PSYCHIC, Type.FAIRY);
		setMove(new moveThunderbolt(), new moveThunderShock(), new moveDoubleTeam(), new	 moveThunderWave());
	}
}