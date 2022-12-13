package sprites;

import java.awt.Color;
import java.awt.Graphics;

public class Laser {
	//vari�veis
	int posXL;
	int posYL = 540;
	
	//construtor que recebe como par�metro a posi��o da nave
	public Laser(int posXLInicial) {
		posXL = posXLInicial;
	}
	
	//m�todo respons�vel para exibir(desenhar) o tiro de laser
	public void exibirLaser(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(posXL, posYL, 5, 20); //x,y,width, height
	}
	
	//m�todo respons�vel pelo movimento do laser
	public void moverLaser() {
		posYL -= 5; //ajuste da velocidade do tiro de laser
		// apoio ao entendimento da l�gica do tiro
		System.out.println(posYL);
	}
	
	//m�todo respons�vel pela "remo��o" do laser
	public boolean removerLaser() {
		if (posYL < 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
