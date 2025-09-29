package commands;

import core.Room;

public class CancelRoomCommand implements Command {
    private Room room;

    public CancelRoomCommand(Room r) {
        this.room = r;
    }

    @Override
    public void execute() {
        if (room != null) room.cancelBooking();
    }
}
