package cache.after;

import java.util.HashMap;

public class VideoDownloaderCache implements Downloader{
    private HashMap<String, Video> videoCache = new HashMap<>();
    private VideoDownloader vd;

    public VideoDownloaderCache() {
        this.vd = new VideoDownloader();
        videoCache = new HashMap<>();
    }

    @Override
    public Video downloadVideo(String link) {

        if(videoCache.containsKey(link)){
            return videoCache.get(link);
        }

        Video v = this.vd.downloadVideo(link);
        this.videoCache.put(link, v);
        return v;
    }
}
