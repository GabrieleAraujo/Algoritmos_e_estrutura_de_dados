package projetoListas;

public class Listaencadeada {
    private Object elemento;
    private Listaencadeada proximo;
    private Listaencadeada anterior; //Inserção do Anterior

    public Listaencadeada(Listaencadeada proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;	}

    public void setProximo(Listaencadeada proximo) {
        this.proximo = proximo;	}

    public Listaencadeada getProximo() {
        return proximo;	}

    public Object getElemento() {
        return elemento;	}

    public Listaencadeada(Object elemento) {
        this(null, elemento);   }

    public Listaencadeada getAnterior() {
        return anterior;	}

    public void setAnterior(Listaencadeada anterior) {
        this.anterior = anterior;	}
}


