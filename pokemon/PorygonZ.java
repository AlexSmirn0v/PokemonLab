package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class PorygonZ extends Porygon2 {
    public PorygonZ(String name, int level) {
        super(name, level);

        setType(Type.NORMAL);
        setStats(85, 80, 70, 135, 75, 90);

        setMove(new ChargeBeam(), new Psybeam(), new DefenseCurl(), new Tackle());
    }
}
