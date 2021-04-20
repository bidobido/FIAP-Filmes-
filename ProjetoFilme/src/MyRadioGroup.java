import java.util.Enumeration;
import java.util.List;

import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class MyRadioGroup extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ButtonGroup grupo = new ButtonGroup();
	private List<String> opcoes;
	
	public MyRadioGroup(List<String> opcoes) {
		this.opcoes = opcoes;
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		opcoes.forEach(opcao -> {
			JRadioButton botao = new JRadioButton(opcao);
		grupo.add(botao);
		this.add(botao);
		});
		
	}

	public String getSelectedButtonText() {
		   for (Enumeration<AbstractButton> buttons = this.grupo.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();

	            if (button.isSelected()) {
	                return button.getText();
	            }
	        }

	     
		return null;
	}

}


//LAMBDA = PASSAR UMA FUNCAO PRA DENTRO DE OUTRA FUNCAO