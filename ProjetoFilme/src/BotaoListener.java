import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class BotaoListener implements ActionListener {

	private MyTextFiled titleField;
	private MyTextArea sinopseField;
	private StarRater avaliacao;
	private Filme filme;
	private JCheckBox checkAssistido;
	private JComboBox<String> combo;
	private MyRadioGroup radioAssistir;

	public BotaoListener(MyTextFiled titleField, MyTextArea sinopseField, JComboBox<String> combo, JCheckBox checkAssistido, StarRater avaliacao, MyRadioGroup radioAssistir) {
		this.titleField = titleField;
		this.sinopseField = sinopseField;
		this.combo = combo;
		this.checkAssistido = checkAssistido;
		this.avaliacao = avaliacao;
		this.radioAssistir = radioAssistir;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		// TODO Auto-generated method stub
		criarFilme();
		outputFilmes();

	}
	public void outputFilmes() {
		System.out.println(titleField.getText());
		System.out.println(sinopseField.getText());
		System.out.println("Nota: " + this.filme.getAvaliacao());
		System.out.println(this.filme.getGenero());
		System.out.println(radioAssistir.getSelectedButtonText());
		
		if(this.filme.isAssistido()) {
			System.out.println("Assistido");	
		}else  {
			System.out.println("Não assistido");
		}
		
		
	}
	private void criarFilme() {
		filme = new Filme();
		filme.setTitulo(titleField.getText());
		filme.setSinopse(sinopseField.getText());
		filme.setGenero(combo.getSelectedItem().toString());
		filme.setAssistido(checkAssistido.isSelected());
		filme.setAvaliacao(avaliacao.getSelection());
		filme.setOndeAssistir(radioAssistir.getSelectedButtonText());
		
	}

}
