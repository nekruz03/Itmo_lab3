package creature;

import com.company.AbstractCreature;

public class Witch extends AbstractCreature {
    public Witch() {
        super("Ведьма");
    }

    @Override
    public boolean isBlackFace() {
        return true;
    }

    public boolean isFat() {
        return false;
    }

    public boolean isSmall() {
        return false;
    }
}


