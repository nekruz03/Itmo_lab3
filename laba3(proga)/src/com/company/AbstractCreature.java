package com.company;
import enums.CreatureState;
import interfaces.Creature;
public abstract class  AbstractCreature implements Creature {
    protected String name;
    private CreatureState state;
    public AbstractCreature( String name){
        this.name = name;
        this.state = CreatureState.NOTHING; // начальная состояния
    }
    public String getName(){
        return name;
    }
    public abstract boolean isBlackFace();
    public  abstract  boolean isFat();
    public  abstract  boolean isSmall();
    // признаки по которым я могу отличать карлсона ведьму и малыша
    //Переопределение метод toString
    public CreatureState getState() {
        return state;
    }
    public void setState(CreatureState state) {
        this.state = state;
    }
    public  String toString(){
        return String.format("%s : %s", name, state);
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        if(o == null) return  false;
        AbstractCreature c = null;
        if(o instanceof AbstractCreature) {
            c = (AbstractCreature) o;
        }
        return c != null && this.isBlackFace() == c.isBlackFace() && this.isFat() == c.isFat() &&
                this.isSmall() == c.isSmall();
    }
}
