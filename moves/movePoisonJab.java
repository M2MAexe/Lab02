package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class movePoisonJab
			extends PhysicalMove {
	public movePoisonJab() {
		super(Type.POISON, 80, 100);		
	}
	
	@Override
	protected void applyOppEffects(Pokemon def) {
		if (Math.random() < 0.3)
			Effect.poison(def);
	}
	
	@Override
	protected String describe() {
		return "применен poison jab!";
	}
}
