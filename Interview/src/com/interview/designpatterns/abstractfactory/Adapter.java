package com.interview.designpatterns.abstractfactory;

public class Adapter {

}

interface MediaPlayer{
	void play(String playerType);
}
interface AdvancedMediaPlayer{
	void playVlc();
	void playMp3();
}

class ConcreteAdvancedMediaPlayer implements AdvancedMediaPlayer{
	public void playVlc(){
		
	}
	public void playMp3(){
		
	}
}


class MediaPlayerAdapter implements MediaPlayer, AdvancedMediaPlayer{
	private AdvancedMediaPlayer mediaPlayer;
	
	@Override
	public void play(String playerType) {
		if(playerType.endsWith("vlc")){
			mediaPlayer.playVlc();
		}else if(playerType.endsWith("mp3")){
			mediaPlayer.playMp3();
		}
	}

	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp3() {
		// TODO Auto-generated method stub
		
	}
	
}

class Client{
	
	MediaPlayerAdapter mediaPlayerAdapter;
	
	public void play(String playerType){
		mediaPlayerAdapter.play(playerType);
	}
}