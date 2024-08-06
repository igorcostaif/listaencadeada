
public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	private int totalDeElementos;
	public void adicionarComeco(String nome) {
		
		Celula nova = new Celula(this.cabeca, nome);
		this.cabeca = nova;
		
		if(this.totalDeElementos==0) {
			
			this.cauda = nova;
		}
		
		this.totalDeElementos++;
		
	}
	
	public void adicionarNoFim(String nome) {
		
		Celula nova = new Celula(nome);
		this.cauda.setProxima(nova);
		this.cauda=nova;
		
		if(this.totalDeElementos==0) {
			
			this.cabeca = nova;
		}
		
		this.totalDeElementos++;
		
		
		
	}
	
	public void adiconarPorPosicao(int posicao, String nome) {
		
		Celula anterior = this.cabeca;
		
		
		if(posicao>this.totalDeElementos || posicao<0) {
	
			throw new IllegalArgumentException("posição fora do intervalo válido");
			
		}
		
		for(int cont=0;cont<posicao-1;cont++) {
			
			anterior = anterior.getProxima();	
			
		}
		
		Celula nova = new Celula(anterior.getProxima(),nome);
		anterior.setProxima(nova);
		this.totalDeElementos++;
	}
	
	public void removerInicio() {
		
		Celula aux = this.cabeca;
		
		this.cabeca = aux.proxima;
		
		aux.setProxima(null);
		
		this.totalDeElementos--;
		
		
	}
	
	public void imprimir() {
		
		Celula aux = this.cabeca;
		for(int cont=0;cont<this.totalDeElementos;cont++) {
			System.out.println(aux.getElemento());
			aux = aux.proxima;
	
		}
		
	}
	
	
	public void removerDoFinal() {
		
		Celula anterior = this.cabeca;
		
		for(int cont=0;cont<this.totalDeElementos-1;cont++) {
			
			anterior = anterior.getProxima();
			
		}
		
		anterior.setElemento(null);
		this.cauda = anterior;
		
		this.totalDeElementos--;
	}
	
	public void removerPorPosicao(int posicao) {
	
		long tempoInicial = System.nanoTime();
		Celula anterior = this.cabeca;
		
		if(this.totalDeElementos==1) {
			removerInicio();
		}
		
		for(int cont=0;cont<posicao-1;cont++) {
			
			anterior = anterior.getProxima();	
			
		}
		
		anterior.setProxima(anterior.getProxima().getProxima());

		long tempoFinal = System.nanoTime();
		
		long tempo = tempoFinal-tempoInicial;
		
		System.out.println("Tempo Total:" + tempo);
		
		this.totalDeElementos--;
	}
	

}
