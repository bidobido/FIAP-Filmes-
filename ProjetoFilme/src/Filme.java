
public class Filme {
	
	private String title;
	private String sinopse;
	private String genero ;
	private String ondeAssistir;
	boolean assistido = false;
	private int avaliacao = 0;
	
	public Filme() {
		
	}
	
	public Filme(String title, String sinopse, String genero, String ondeAssistir, boolean assistido,
			int avaliacao) {
		super();
		this.title = title;
		this.sinopse = sinopse;
		this.genero = genero;
		this.avaliacao = avaliacao;
		this.ondeAssistir = ondeAssistir;
		this.assistido = assistido;
		
	}
	
	public String getTitulo() {
		return title;
	}

	public void setTitulo(String titulo) {
		this.title = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getOndeAssistir() {
		return ondeAssistir;
	}

	public void setOndeAssistir(String ondeAssistir) {
		this.ondeAssistir = ondeAssistir;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public boolean isAssistido() {
		return assistido;
	}

	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}

}


