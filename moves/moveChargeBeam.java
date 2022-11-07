package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class moveChargeBeam 
			extends SpecialMove {
	public moveChargeBeam() {
		super(Type.ELECTRIC, 50, 90);
	}
	
	@Override
	protected void applySelfEffects(Pokemon atk) {
		atk.addEffect(new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1));
	}
	
	@Override
	protected String describe() {
		return "применен charge beam!";
	}

}
