package Rooms;

import com.company.AbstractRoom;

public class DiningRoom extends AbstractRoom {

    public DiningRoom(){
        super("DiningRoom");
    }

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
