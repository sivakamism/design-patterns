public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MP3Player();
        player.play("mp3", "song1.mp3");
        player.play("mp4", "movie1.mp4"); 

        MediaPlayer adapter = new MediaAdapter();
        adapter.play("mp4", "movie2.mp4");
    }
}
