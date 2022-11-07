package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class moveSpark
			extends PhysicalMove {
	public moveSpark() {
		super(Type.ELECTRIC, 65, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon def) {
		if (Math.random() < 0.3)
			Effect.paralyze(def);
	}
	
	@Override
	protected String describe() {
		return "применен spark!";
	}
}
