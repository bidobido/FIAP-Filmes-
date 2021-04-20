import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyImage extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyImage(ImageIcon imagem) {
		super(imagem);
		init();
	}
	private void getScaledInstance(int i, int j, int scaleDefault) {
		// TODO Auto-generated method stub
		
	}
	private void init() {
		// TODO Auto-generated method stub
		this.setHorizontalAlignment(JLabel.CENTER);
//		this.getScaledInstance(250,600, Image.SCALE_DEFAULT);
		this.setPreferredSize(new Dimension(300,200));
		
	}
	
}
//Image newImage = yourImage.getScaledInstance(200, 500, Image.SCALE_DEFAULT);