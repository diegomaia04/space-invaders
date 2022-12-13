package main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Backdrop {
	BufferedImage background;

	// posi��o inicial eixo y para desenhar o background
	// esta vari�vel precisa ser global
	int posBy = 0;

	// construtor
	public Backdrop() {
		// tratamento de exce��es
		try {
			// carregar a imagem(upload)
			// Aten��o! escolher imagens de background do tamanho da tela ou superior
			background = ImageIO.read(new File("img/background.jpg"));
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel carregar a imagem");
			System.out.println(e);
		}

	}// fim do construtor

	// m�todo respons�vel por "desenhar" o background
	public void exibirBackground(Graphics g) {
		g.drawImage(background, 0, posBy - 720, null);
		g.drawImage(background, 0, posBy, null);

		if (posBy > 720) {
			posBy = 0;
		} else {
			posBy += 2;
		}
	}

}// fim do c�digo
