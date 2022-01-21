package interfaces;

import enums.CreatureState;

public interface Creature {
    //
    public  String getName();
    //состояние существа
    CreatureState getState();
    public void setState(CreatureState name);
}