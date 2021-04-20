import javax.swing.JTextArea;

public class MyTextArea extends JTextArea{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int linhas = 3;
	private int colunas = 25;
	
	public MyTextArea() {
		super();
		init();
	}
	
	private void init() {
		this.setRows(linhas);
		this.setColumns(colunas);
		this.setBorder(BorderFactory.criar());
	}
}
