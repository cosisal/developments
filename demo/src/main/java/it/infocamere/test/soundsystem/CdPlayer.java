package it.infocamere.test.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer implements MediaPlayer{
	private CompactDisc cd;
	
	@Autowired
	public CdPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
	
	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	@Autowired(required=false)
	public void insertDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
}
