import pokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public final class Game {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon[] allies = { new Cranidos("Гарри", 19), new Stantler("Рон", 20), new PorygonZ("Гермиона", 20) };
        Pokemon[] foes = { new Porygon("Воландеморт", 20), new Rampardos("Люциус", 19), new Porygon2("Беллатриса", 20) };

        for (Pokemon p : allies)
            b.addAlly(p);
        for (Pokemon f : foes)
            b.addFoe(f);

        b.go();
    }
}