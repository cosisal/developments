package it.infocamere.test.batch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.infocamere.test.soundsystem.CdPlayerConfig;
import it.infocamere.test.soundsystem.CompactDisc;
import it.infocamere.test.soundsystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CdPlayerConfig.class)
public class TestBeanSpringCdPlayer {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void play() {
		player.play();
//		System.out.println("--> "+log.getLog());
		assertEquals("Provo a suonare un pezzo Let it be by The Beatles", log.getLog());
	}

}
