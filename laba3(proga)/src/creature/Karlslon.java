package creature;

import com.company.AbstractCreature;

public class Karlslon extends AbstractCreature {
    public Karlslon (){
        super("Карлсон");
    }
    @Override
    public boolean isBlackFace() {
        return false;
    }
    public boolean isFat(){return  true;}
    public  boolean isSmall(){return  false;}
}
