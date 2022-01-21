package interfaces;

import java.util.List;

public interface Room  {
    String getName();
    // существа , находящиеся в комнате в комнате должен быть список существ
    List<Creature> getCreatures();
    // добавить существо в локацию
    void addCreature(Creature c);
    // удалить существо из локации
    void removeCreature(Creature c);
}
