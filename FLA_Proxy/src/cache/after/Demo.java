package cache.after;

public class Demo {

    public static void main(String[] args) {
        VideoDownloaderCache vd = new VideoDownloaderCache();

        vd.downloadVideo("https://www.youtube.com/watch?v=cW8VLC9nnTo");
        vd.downloadVideo("https://www.vidio.com/watch?v=cW8VLC9nnTo");
        vd.downloadVideo("https://www.netflix.com/watch?v=cW8VLC9nnTo");
        vd.downloadVideo("https://www.youtube.com/watch?v=cW8VLC9nnTo");
    }

}
