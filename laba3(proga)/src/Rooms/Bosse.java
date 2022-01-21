package Rooms;

import com.company.AbstractRoom;

public class Bosse extends AbstractRoom {
    public Bosse(){super("Bosse");}
    @Override
    public boolean hasWindows() {
        return false;
    }

    @Override
    public boolean isViewOnStreet() {
        return false;
    }

    @Override
    public boolean doesItHaveAStove() {
        return false;
    }
}
