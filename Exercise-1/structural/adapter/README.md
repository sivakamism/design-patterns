Use Case 1: Adapter Pattern

Problem Statement
   We have a `MediaPlayer` interface that supports playing MP3 files.  
   Now we also want to support MP4 files without changing the existing `MP3Player` implementation.

Design Pattern Applied
    Adapter Pattern – acts as a bridge between two incompatible interfaces.

Files
     - `MediaPlayer.java` → Target interface  
     - `MP3Player.java` → Existing player (supports mp3 only)  
     - `MP4Player.java` → Adaptee (supports mp4 only)  
     - `MediaAdapter.java` → Adapter  
     - `AdapterDemo.java` → Main demo  
