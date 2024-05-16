package Listas;

public class Lista {
    private Object elemento;
    private Lista proximo;

    public Lista(Object elemento, Lista proximo) {
        this.elemento = elemento;
        this.proximo = proximo;	}


    public Lista getProximo() {
        return proximo;	}

    public void setProximo(Lista proximo) {
        this.proximo = proximo;	}

    public Object getElemento() {
        return elemento;	}


}
