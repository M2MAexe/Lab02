import moves.moveChargeBeam;
import moves.moveThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class pokemonTynamo
			extends Pokemon {
	public pokemonTynamo(java.lang.String Name, int Level) {
		super(Name, Level);
		setStats(35, 55, 40, 45, 40, 60);
		setType(Type.ELECTRIC);
		setMove(new moveThunderWave(), new moveChargeBeam());
	}

}
