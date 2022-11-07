package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class moveCalmMind
			extends StatusMove {
	public moveCalmMind() {
		super(Type.PSYCHIC, 0, 100);
	}
	
	@Override
	protected void applySelfEffects(Pokemon atk) {
		atk.addEffect(new Effect().turns(1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1));
	}

	@Override
	protected String describe() {
		return "применен calm mind!";
	}
}
