package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Porygon2 extends Porygon {
    public Porygon2(String name, int level) {
        super(name, level);

        setType(Type.NORMAL);
        setStats(85, 80, 90, 105, 95, 60);

        setMove(new ChargeBeam(), new Psybeam(), new DefenseCurl());
    }
}
