package projetoarvore;

public class ArvoreBinaria<T extends Comparable<T>> {
    private NoBinario<T> raiz;
    public ArvoreBinaria(){
        this.raiz = null;
    }
    public void inserir(T dados){
        NoBinario<T> novoNo = new NoBinario<>(dados);
        raiz = inserir(raiz, novoNo);
    }
    private NoBinario<T> inserir(NoBinario<T> atual, NoBinario<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if(novoNo.getDados().compareTo(atual.getDados()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }
    public void exibirInOrdem(){
        System.out.println("\nExibindo InOrdem:");
        exibirInOrdem(this.raiz);
    }
    private void exibirInOrdem(NoBinario<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getDados() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }
    public void exibirPosOrdem(){
        System.out.println("\nExibindo PosOrdem:");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoBinario<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getDados() + ", ");
        }
    }
    public void exibirPreOrdem(){
        System.out.println("\nExibindo PreOrdem:");
        exibirPreOrdem(this.raiz);
    }
    private void exibirPreOrdem(NoBinario<T> atual){
        if(atual != null){
            System.out.print(atual.getDados() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }
    public void remover(T dados){
        try {
            NoBinario<T> atual = this.raiz;
            NoBinario<T> pai = null;
            NoBinario<T> filho = null;
            NoBinario<T> temp = null;
            while (atual != null && !atual.getDados().equals(dados)){
                pai = atual;
                if(dados.compareTo(atual.getDados()) < 0){
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }
            if(atual == null){
                System.out.println("dados nao encontrado. Bloco Try");
            }
            if(pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                } else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                } else {
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {
                for(
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }
        } catch (NullPointerException erro){
            System.out.println("dados nao encontrado. Bloco Catch");
        }
    }
}
