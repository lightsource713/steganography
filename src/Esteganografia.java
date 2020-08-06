import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Esteganografia {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pathIn = "in/";
		String imagemEntrada = pathIn + "vaca.jpg";
		String figuraEmbutir = pathIn + "chef.png";
		String textoEmbutir = "Esse texto est� escondido na imagem!";

		String pathOut = "out/";
		String imagemEmbutidaTexto = pathOut + "texto-embutido.png";
		String imagemEmbutidaFigura = pathOut + "figura-embutida.png";
		String figuraExtraida = pathOut + "figura-extraida.png";
		String textoExtraido = pathOut + "text-extraido.txt";
						
		BufferedImage originalImageText = null;
		BufferedImage coverImageText = null;
		BufferedImage coverImage = null;
		BufferedImage secretImage = null;
		
		try {
			originalImageText = ImageIO.read(new File(imagemEntrada));
			coverImageText = ImageIO.read(new File(imagemEntrada));
			coverImage = ImageIO.read(new File(imagemEntrada));
			secretImage = ImageIO.read(new File(figuraEmbutir));
			
			coverImageText = Algoritmo.embedText(coverImageText, textoEmbutir, imagemEmbutidaTexto);								// embed the secret information
			Algoritmo.extractText(ImageIO.read(new File(imagemEmbutidaTexto)), textoEmbutir.length(), textoExtraido);		// extract the secret information
			
			coverImage = Algoritmo.embedImage(coverImage, secretImage, imagemEmbutidaFigura);	// embed the secret image into a cover image
			Algoritmo.extractImage(ImageIO.read(new File(imagemEmbutidaFigura)), secretImage.getWidth(), secretImage.getHeight(),figuraExtraida);	 // extract secret image from a cover image	
			
			JFrame frame = new JFrame("Esteganografia");
			JPanel panel = new JPanel();
			JLabel label1 = new JLabel(new ImageIcon(originalImageText));
			JLabel label2 = new JLabel(new ImageIcon(coverImageText));
			JLabel label3 = new JLabel(new ImageIcon(coverImage));
			panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			frame.add(panel);
			frame.pack();
			frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			frame.setVisible(true);				
			
		} catch(Exception e) {		
			System.out.println(e.getMessage());
		}		
	}
} 