package it.infocamere.test.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPepper implements CompactDisc {

	private String titolo = "Let it be";
	private String autore = "The Beatles";
	
	@Override
	public void play() {
		System.out.println("Provo a suonare un pezzo "+titolo+" by "+autore);

	}

}
