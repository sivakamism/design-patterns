package main;

import java.util.*;
import core.*;
import commands.*;

public class SmartOfficeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Office office = Office.getInstance();

        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("Exit")) break;

            String[] parts = input.split(" ");
            try {
                // 🔒 Authentication required for config, block, cancel
                if ((parts[0].equalsIgnoreCase("block") ||
                     parts[0].equalsIgnoreCase("cancel") ||
                     parts[0].equalsIgnoreCase("config")) 
                     && !AuthManager.isLoggedIn()) {
                    System.out.println("You must log in first.");
                    continue;
                }

                switch (parts[0].toLowerCase()) {
                    case "config":
                        if (parts[1].equalsIgnoreCase("room") && parts[2].equalsIgnoreCase("count")) {
                            int count = Integer.parseInt(parts[3]);
                            office.configureRooms(count);
                        } else if (parts[1].equalsIgnoreCase("room") && parts[2].equalsIgnoreCase("max") 
                                   && parts[3].equalsIgnoreCase("capacity")) {
                            int id = Integer.parseInt(parts[4]);
                            int cap = Integer.parseInt(parts[5]);
                            Room r = office.getRoom(id);
                            if (r != null) new ConfigCapacityCommand(r, cap).execute();
                            else System.out.println("Invalid room number. Please enter a valid room number.");
                        }
                        break;

                    case "add":
                        if (parts[1].equalsIgnoreCase("occupant")) {
                            int id = Integer.parseInt(parts[2]);
                            int cnt = Integer.parseInt(parts[3]);
                            Room r = office.getRoom(id);
                            if (r != null) new AddOccupantCommand(r, cnt).execute();
                            else System.out.println("Room " + id + " does not exist.");
                        }
                        break;

                    case "block":
                        if (parts[1].equalsIgnoreCase("room")) {
                            int id = Integer.parseInt(parts[2]);
                            String time = parts[3];
                            int dur = Integer.parseInt(parts[4]);
                            Room r = office.getRoom(id);
                            if (r != null) new BookRoomCommand(r, time, dur).execute();
                            else System.out.println("Invalid room number. Please enter a valid room number.");
                        }
                        break;

                    case "cancel":
                        if (parts[1].equalsIgnoreCase("room")) {
                            int id = Integer.parseInt(parts[2]);
                            Room r = office.getRoom(id);
                            if (r != null) new CancelRoomCommand(r).execute();
                            else System.out.println("Invalid room number. Please enter a valid room number.");
                        }
                        break;

                    case "room":
                        if (parts[1].equalsIgnoreCase("status")) {
                            int id = Integer.parseInt(parts[2]);
                            Room r = office.getRoom(id);
                            if (r != null) r.checkStatus();
                            else System.out.println("Invalid room number. Please enter a valid room number.");
                        }
                        break;

                    case "usage":
                        int id = Integer.parseInt(parts[1]);
                        Room r = office.getRoom(id);
                        if (r != null) r.printUsageStats();
                        else System.out.println("Invalid room number.");
                        break;

                    case "login":
                        if (parts.length < 3) {
                            System.out.println("Usage: login <username> <password>");
                        } else {
                            AuthManager.login(parts[1], parts[2]);
                        }
                        break;

                    default:
                        System.out.println("Invalid command.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input format.");
            }
        }
        sc.close();
    }
}
