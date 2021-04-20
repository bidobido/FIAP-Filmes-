import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Aplicativo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame frame = new JFrame("FIAP Movies");
		
		
		JPanel cadastro = new JPanel();
		cadastro.setBackground(Color.gray);
		cadastro.setPreferredSize(new Dimension(900,600));
		cadastro.setLayout(new BorderLayout());
		
		JPanel leftPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		
		
		//LABELS
		leftPanel.setBackground(Color.LIGHT_GRAY);
		leftPanel.setLayout(new FlowLayout());
		leftPanel.setPreferredSize(new Dimension(300,600));
		
		centerPanel.setBackground(Color.LIGHT_GRAY);
		centerPanel.setLayout(new FlowLayout());
		centerPanel.setPreferredSize(new Dimension(300,600));
		
		rightPanel.setBackground(Color.LIGHT_GRAY);
		rightPanel.setLayout(new FlowLayout());
		rightPanel.setPreferredSize(new Dimension(300,600));
		
		// LEFT PANEL
		leftPanel.add(new MyLabel("Poster", Color.BLACK));
		frame.add(leftPanel);
		leftPanel.add(new MyImage(new ImageIcon("src/parasita_pequeno.png")));	
		
		//CENTER PANEL
		centerPanel.add(new MyLabel("Título", Color.BLACK));
		MyTextFiled titleField = new MyTextFiled();
		centerPanel.add(titleField);
		
		centerPanel.add(new MyLabel("Sinopse", Color.BLACK));
		MyTextArea sinopseField = new MyTextArea();
		centerPanel.add(sinopseField);
		
		//COMBOBOX GENERO
//		
//		JComboBox comboGenero = new JComboBox();
//		centerPanel.add(comboGenero);
//		comboGenero.addItem("Terror");
//		comboGenero.addItem("Ação");
//		comboGenero.addItem("Drama");
//		comboGenero.addItem("Sci-fi");
		
		String[] generos = {"-", "Terror", "Ficção Científica", "Ação", "Drama", "Comédia"};
		MyComboBox combo = new MyComboBox(generos);
		centerPanel.add(combo);
			
		
		//BOTÕES
		JButton enviarBtn = new JButton("Enviar");
		centerPanel.add(enviarBtn);
		
		JButton cancelarBtn = new JButton("Cancelar");
		centerPanel.add(cancelarBtn);
	
		
		//RIGHT PANEL
		
		rightPanel.add(new MyLabel("Onde assistir", Color.BLACK));
		frame.add(rightPanel);
		MyRadioGroup radioAssistir = new MyRadioGroup(List.of("Netflix", "Prime Video", "Pirate Bay"));
		rightPanel.add(radioAssistir);
		
		JCheckBox checkAssistido = new JCheckBox("Assistido");
		rightPanel.add(checkAssistido);
		
		rightPanel.add(new MyLabel("Avaliação", Color.BLACK));
		StarRater avaliacao = new StarRater();
		rightPanel.add(avaliacao);
		
		//DEVE SER BORDERLAYOUT DENTRO DE BORDER LAYOUT
		
		//Adicionando Panels no Panel principal
		
		cadastro.add(leftPanel, BorderLayout.WEST);
		cadastro.add(centerPanel, BorderLayout.CENTER);
		cadastro.add(rightPanel, BorderLayout.EAST);
		
		
		
		
		
		//ADICIONANADO ABAS
		JTabbedPane abas = new JTabbedPane();
		abas.add("Início", cadastro);
		abas.add("Lista", new JPanel());
		frame.add(abas);
				
		//ALTERAÇÕES NO FRAME: ADICIONAR PANELS, DEIXAR VISIVEL E PODER FECHAR
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850, 420);
		frame.setVisible(true);
		frame.setResizable(false);
		
		
		//EVENTS
		enviarBtn.addActionListener(new BotaoListener(titleField, sinopseField, combo,
				checkAssistido, avaliacao, radioAssistir));
		
//		enviarBtn.addItemListener(new ComboListener(combo));
		
		}
}

//colocamos o panel dentro do border layout
//JFrame = janela principal