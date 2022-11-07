import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon p1 = new pokemonTapuLele("01", 1);
		Pokemon p2 = new pokemonMeditite("02", 1);
		Pokemon p3 = new pokemonEelektross("03", 1);
		Pokemon p4 = new pokemonTynamo("04", 1);
		Pokemon p5 = new pokemonEelektrik("05", 1);
		Pokemon p6 = new pokemonMedicham("06", 1);
		
		b.addAlly(p1);
		b.addAlly(p6);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p2);
		b.go();
	}
}
