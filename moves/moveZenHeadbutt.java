package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class moveZenHeadbutt
			extends PhysicalMove {
	public moveZenHeadbutt() {
		super(Type.PSYCHIC, 80, 90);
	}
	
	@Override
	protected void applyOppEffects(Pokemon def) {
		if (Math.random() < 0.2)
			Effect.flinch(def);
	}
	
	@Override
	protected String describe() {
		return "применен zen headbutt!";
	}

}
