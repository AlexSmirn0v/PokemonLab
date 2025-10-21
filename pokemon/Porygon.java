package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Porygon extends Pokemon {
    public Porygon(String name, int level) {
        super(name, level);

        setType(Type.NORMAL);
        setStats(65, 60, 70, 85, 75, 40);

        setMove(new ChargeBeam(), new Psybeam());
    }
}
