package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class moveThunderWave
			extends StatusMove {
	public moveThunderWave() {
		super(Type.ELECTRIC, 0, 90);
	}
	
	@Override
	protected void applyOppEffects(Pokemon def) {
		Effect.paralyze(def);
		def.addEffect(
				new Effect().turns(1).attack(0.25).stat(Stat.SPEED, (int)(-0.5 * def.getStat(Stat.SPEED))));
	}
	
	@Override
	protected String describe() {
		return "применен thunder wave!";
	}

}
