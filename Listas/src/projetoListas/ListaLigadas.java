package projetoListas;

public  class ListaLigadas {

    private Lista primeira = null;
    private int totalDeElementos = 0;
    private Lista ultima = null;

    public void adicionaNoComeco(Object elemento)
    {
        Lista novoelemento = new Lista(elemento, primeira);
        this.primeira = novoelemento;

        if(this.totalDeElementos == 0) {
            this.ultima = this.primeira;
        }

        this.totalDeElementos++; }

    public void adiciona(Object elemento) {

        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Lista nova = new Lista(elemento, null);
            this.ultima.setProximo(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    private boolean posicaol(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    @SuppressWarnings("unused")
    private Lista busca(int posicao)
    {
        if(!posicaol(posicao)) {
            throw new IllegalArgumentException("posicao inexistente");
        }

        Lista atual = primeira;

        for(int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;}



    public int tamanho() {
        return this.totalDeElementos;
    }



    @Override

    public String toString () {

        if(this.totalDeElementos == 0) {
            return "()"; }

        Lista atual = primeira;
        StringBuilder builder = new StringBuilder("(");
        for(int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }
        builder.append(")");
        return builder.toString(); }
}