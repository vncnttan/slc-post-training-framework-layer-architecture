package cache.before;

public class VideoDownloader implements Downloader{
	
	private String link;

	@Override
	public Video downloadVideo() {
		// TODO Auto-generated method stub
		System.out.println("Downloading from the link: " + link);
		return new Video("Some title");
	}

}
