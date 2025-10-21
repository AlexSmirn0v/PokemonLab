package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public final class Rampardos extends Cranidos{
    public Rampardos(String name, int level) {
        super(name, level);

        setType(Type.ROCK);
        setStats(97, 165, 60, 65, 50, 58);

        setMove(new ScaryFace(), new FireBlast(), new FocusEnergy(), new FocusBlast());
    }
}
