package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public class Cranidos extends Pokemon{
    public Cranidos(String name, int level) {
        super(name, level);

        setType(Type.ROCK);
        setStats(67, 125, 40, 30, 30, 58);

        setMove(new ScaryFace(), new FireBlast(), new FocusEnergy());
    }
}
