package com.company;
import interfaces.Creature;
import interfaces.Room;
import java.util.ArrayList;
import java.util.List;
//детилезируем локацию
// Здесь абстрактная комната
public abstract class AbstractRoom implements Room {
    private String name;
    private List<Creature> creatures;
    // constructor
    public AbstractRoom(String name){
        this.name = name;
        // Инициализируем коллекцию динамическим массивом ArrayList
        this.creatures = new ArrayList<>();
    }
    //Это реализацию метод интерфейса
    public  String getName(){
        return  name;
    }
    // отличительные признаки комнат
    public  abstract boolean hasWindows();
    //выходит ли окна на улицу
    public  abstract boolean isViewOnStreet();
    //создать метод есть ли плита
    public abstract  boolean doesItHaveAStove();

    @Override
    public List<Creature> getCreatures() {
        return creatures;
    }

    @Override
    public void addCreature(Creature c) {
        if (c != null) {
            creatures.add(c);
        }
    }
    @Override
    public void removeCreature(Creature c) {
        if ( c != null) {
            creatures.remove(c);
        }
    }
    @Override
    public  String toString(){
        String s =  String.format("Имя комнаты : %s \n Существа : ", name);
        for (Creature c : creatures) {
            s = s  + c.getName() + " ";
        }
        return s;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    //Переопределили метод equals
    @Override
    public boolean equals(Object o) {
        if(o == null) return  false;
        AbstractRoom c = null;
        // является ли обьект o классом AbstractRoom
        if(o instanceof AbstractRoom) {
            // явное приведение к типу AbstarctRoom
            c = (AbstractRoom) o;
        }
        if (c != null && this.name.equals(c.name)) {
            return true;
        };
        return false;
    }
}
