package encapsulamento;

public class Classes {
	
	String marca;
	String tipo;
	String tamanho;
	int quantidade;
	double valor;
	
	 public Classes(String marca, String tipo, String tamanho, int quantidade, double valor) {
	     this.marca = marca;
	     this.tipo = tipo;
	     this.tamanho = tamanho;
	     this.quantidade = quantidade;
	     this.valor = valor;
	    }


	public double getValorTotalEstoque() {
		return quantidade * valor;
	}
	
	public void adicionarEstoque(int quantidade) {
		this.quantidade  += quantidade;
	}

	 public boolean removerEstoque(int quantidade) {
	        if (quantidade <= this.quantidade) {
	            this.quantidade -= quantidade;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void exibirInfo() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Tipo: " + tipo);
	        System.out.println("Tamanho: " + tamanho);
	        System.out.println("Quantidade em estoque: " + quantidade);
	        System.out.println("Valor unitário: R$" + valor);
	        System.out.println("Valor total em estoque: R$" + getValorTotalEstoque());
	        System.out.println("----------------------------------");
	    }

}