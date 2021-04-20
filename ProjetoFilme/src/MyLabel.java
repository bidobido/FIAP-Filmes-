import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyLabel extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int size = 18;
	private Color cor = new Color(29,27,83);
	public MyLabel (String texto) {
		super(texto);
		init();
	}
	
	public MyLabel(String texto, Color cor) {
		super(texto);
		this.cor = cor;
		init();
	}

	public MyLabel(ImageIcon img) {
		// TODO Auto-generated constructor stub
		super(img);
		this.setPreferredSize(new Dimension(500, 500));
		this.setHorizontalAlignment(JLabel.CENTER);
		init();
	}

	private void init() {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(cor);
		this.setPreferredSize(new Dimension(200, 80));
		this.setFont(new Font(null, Font.BOLD, size));
	}
}
