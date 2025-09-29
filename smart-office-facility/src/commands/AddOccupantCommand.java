package commands;

import core.Room;

public class AddOccupantCommand implements Command {
    private Room room;
    private int count;

    public AddOccupantCommand(Room r, int c) {
        this.room = r;
        this.count = c;
    }

    @Override
    public void execute() {
        if (room != null) room.addOccupants(count);
    }
}
