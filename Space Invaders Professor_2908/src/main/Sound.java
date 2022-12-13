package main;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public void play() {
		//carregar o arquivo de �udio
		File file = new File("som/laser1.wav");
		//tratamento de exce��es(arquivo n�o encontrado, formato etc)
		try {
			//relacionado ao hardware de �udio do sistema
			AudioInputStream audio = AudioSystem.getAudioInputStream(file);
			//Controle do �udio (reprodu��o, pausa, avan�o etc)
			Clip clip = AudioSystem.getClip();
			clip.open(audio);
			clip.start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
