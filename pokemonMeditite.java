import moves.moveCalmMind;
import moves.moveFacade;
import moves.movePoisonJab;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class pokemonMeditite
			extends Pokemon {
	public pokemonMeditite( java.lang.String Name, int Level ) {
		super(Name, Level);
		setStats(30, 40, 55, 40, 55, 60);
		setType(Type.FIGHTING, Type.PSYCHIC);
		setMove(new movePoisonJab(), new moveFacade(), new moveCalmMind());
	}
}
