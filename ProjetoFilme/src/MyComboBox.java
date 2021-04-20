import javax.swing.JComboBox;

public class MyComboBox extends JComboBox<String> {

	private static final long serialVersionUID = -73642545873453690L;

	private String[] generos;

	public MyComboBox(String[] generos) {
		super();
		this.generos = generos;
		init();
	}

	private void init() {
		for (String genero : generos) {
			this.addItem(genero);
		}
		this.setBorder(BorderFactory.criar());
	
	}
}