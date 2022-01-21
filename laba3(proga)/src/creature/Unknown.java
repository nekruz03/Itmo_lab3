package creature;

import com.company.AbstractCreature;

public class Unknown extends AbstractCreature {
    public Unknown() {
        super("");
    }

    @Override
    public boolean isBlackFace() {
        return true;
    }

    public boolean isFat() {
        return true;
    }

    public boolean isSmall() {
        return false;
    }
}


