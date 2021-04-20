import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;

public class MyTextFiled  extends JTextField{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public MyTextFiled() {
		super();
		init();
	}
	private void init() {
		this.setPreferredSize(new Dimension(150,30));
		this.setBackground(Color.white);
		this.setBorder(BorderFactory.criar());
	}
}
