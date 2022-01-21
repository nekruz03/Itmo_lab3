package com.company;
import Rooms.Kitchen;
import creature.Baby;
import creature.Karlslon;
import creature.Unknown;
import creature.Witch;
import enums.CreatureState;
import interfaces.Creature;
import interfaces.Room;
public class Main {
    public static void main(String[] args) {
        System.out.println("Begin");
        Creature baby = new Baby();
        //малыш искал его всюду
        baby.setState(CreatureState.SEARCHING);
          System.out.println(baby.toString());
        Room kitchen = new Kitchen();
        kitchen.addCreature(baby);
        // Создаем Карслсона и ведьму одновременно, потому что нет ясности кто есть кто
        Creature karlslon = new Karlslon();
        kitchen.addCreature(karlslon);
        // создаем ведьму
        Creature witch = new Witch();
        // создаем непонятное существо, не понимаем кто это Карлсон или ведьма
        // малыш не понимает кто это Карлсон или ведьма и делает вывод на основе сравнения существ
        Creature unknown = new Unknown();
        // проверяем является ли существо на окне Карлсоно, если нет то считаем его ведьмой
        // добавляем существо на кухню
        // Малыш решил,что если неизвестное существо не карлсон, то оно ведьма
        // Условие по которому мы принимаем решение
        if (unknown.equals(karlslon)) {
            kitchen.addCreature(karlslon);
            System.out.println(kitchen.toString());
            karlslon.setState(CreatureState.FLYING);
            System.out.println(karlslon.toString());
        } else {
            kitchen.addCreature(witch);
            System.out.println(kitchen.toString());
            witch.setState(CreatureState.FLYING);
            System.out.println(witch.toString());
        }
        kitchen.removeCreature(witch);
        //От комнаты kitchen удалю ведьму
        System.out.println(kitchen.toString());
        baby.setState(CreatureState.RUSHED);
        System.out.println(baby.toString());
        Room bosse = new Rooms.Bosse();
        bosse.addCreature(baby);
        System.out.println(bosse.toString());
        kitchen.removeCreature(baby);
        System.out.println(kitchen.toString());
        System.out.println("End");
    }
}
