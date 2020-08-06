import java.io.File;
import javax.imageio.ImageIO;

public class EsteganografiaReverso {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pathIn = "out/";
		String imagemEmbutidaTexto = pathIn + "texto-embutido.png";				// texto certo:     animal.png
		String imagemEmbutidaFigura = pathIn + "figura-embutida.png";			// imagem certa:	ave.png

		try {
			int tamanhoTexto = 10;
			Algoritmo.extractText(ImageIO.read(new File(imagemEmbutidaTexto)), tamanhoTexto, null);		// extract the secret information
			
			int alturaSecreta = 61;
			int larguraSecreta = 50;
			Algoritmo.extractImage(ImageIO.read(new File(imagemEmbutidaFigura)), larguraSecreta, alturaSecreta,null);	 // extract secret image from a cover image	
								
			
		} catch(Exception e) {		
			System.out.println(e.getMessage());
		}		
	}
}
