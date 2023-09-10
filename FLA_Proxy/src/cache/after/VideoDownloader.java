package cache.after;

public class VideoDownloader implements Downloader {
	

	@Override
	public Video downloadVideo(String link) {
		// TODO Auto-generated method stub
		System.out.println("Downloading from the link: " + link);
		return new Video("Some title");
	}

}
