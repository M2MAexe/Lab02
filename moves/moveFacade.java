package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class moveFacade
			extends PhysicalMove {
	public moveFacade() {
		super(Type.NORMAL, 70, 100);
	}

	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		if (def.getCondition() == Status.POISON || def.getCondition() == Status.PARALYZE ||
				def.getCondition() == Status.BURN)
			super.power = 140;
			super.applyOppDamage(def, damage);
		super.power = 70;	
	}
	
	@Override
	protected String describe() {
		return "применен facade!";
	}
}
