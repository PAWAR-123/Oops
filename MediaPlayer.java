package newopps;

public interface MediaPlayer {
	public void play();
	public void stop();
	

}
interface AdvancedmediaPlayer extends MediaPlayer{
	public void pause();
	
	
	
}
class MusicPlayer implements AdvancedmediaPlayer{
	private String songTitle="life";
	
	public String getsongTitel() {
		if(songTitle==null) {
			System.out.println("invalid song ");
			return songTitle;
		}
		return songTitle;
	}

	@Override
	public void play() {
		System.out.println("music is playing.... "+songTitle);
		
	}

	@Override
	public void stop() {
		System.out.println("music is stop  "+songTitle);
		
	}

	@Override
	public void pause() {
		System.out.println("music is pause  "+songTitle);
		
	}
	
}
class VideoPlayer implements AdvancedmediaPlayer{
private String videoTitle="phusha2";
public String getvideoTitle() {
	if(videoTitle==null) {
		System.out.println("invalid viedo");
		return videoTitle;
	}
	return videoTitle;
}
	@Override
	public void play() {
		System.out.println("video is playing ...."+videoTitle);
		
	}

	@Override
	public void stop() {
		System.out.println("video is stop  "+videoTitle);
		
	}

	@Override
	public void pause() {
		System.out.println("video is pause  "+videoTitle);
		
	}
	
}
