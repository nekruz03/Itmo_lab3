package Rooms;

import com.company.AbstractRoom;

public class Kitchen extends AbstractRoom {
    public Kitchen(){
        super("Kitchen");
    }
    @Override
    public boolean hasWindows() {
        return true;
    }

    @Override
    public boolean isViewOnStreet() {
        return false;
    }

    @Override
    public boolean doesItHaveAStove() {
        return true;
    }
}
