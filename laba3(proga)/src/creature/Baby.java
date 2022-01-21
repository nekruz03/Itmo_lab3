package creature;

import com.company.AbstractCreature;

public class Baby extends AbstractCreature {
    public Baby(){
        super("Малыш");
    }
    @Override
    public boolean isBlackFace() {
        return false;
    }
    @Override
    public boolean isFat() {
        return false;
    }

    @Override
    public boolean isSmall() {
        return true;
    }
}
