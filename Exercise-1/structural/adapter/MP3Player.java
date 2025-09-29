public class MP3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            System.out.println("Invalid media. Adapter required for: " + audioType);
        }
    }
}
