package commands;

import core.Room;

public class BookRoomCommand implements Command {
    private Room room;
    private String time;
    private int duration;

    public BookRoomCommand(Room r, String t, int d) {
        this.room = r;
        this.time = t;
        this.duration = d;
    }

    @Override
    public void execute() {
        if (room != null) room.book(time, duration);
    }
}
