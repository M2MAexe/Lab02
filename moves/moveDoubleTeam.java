package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class moveDoubleTeam
			extends StatusMove {
	public moveDoubleTeam() {
		super(Type.NORMAL, 0, 100);
	}
	
	@Override
	protected String describe() {
		return "применен double team!";
	}
	
	@Override
	protected void applySelfEffects(Pokemon atk) {
		atk.addEffect(new Effect().chance(1).turns(0).stat(Stat.EVASION, 1));
	}
}
