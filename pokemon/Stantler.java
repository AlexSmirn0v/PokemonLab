package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public final class Stantler extends Pokemon{
    public Stantler(String name, int level) {
        super(name, level);

        setType(Type.NORMAL);
        setStats(73, 95, 62, 85, 65, 85);

        setMove(new ChargeBeam(), new EnergyBall(), new Extrasensory(), new Bite());
    }
}
