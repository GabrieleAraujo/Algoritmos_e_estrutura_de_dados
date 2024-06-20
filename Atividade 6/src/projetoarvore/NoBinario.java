package projetoarvore;

public class NoBinario<T extends Comparable<T>> {
    private T dados;
    private NoBinario<T> noEsq;
    private NoBinario<T> noDir;
    public NoBinario(T dados) {
        this.dados = dados;
        noEsq = noDir = null;
    }
    public NoBinario() {
    }
    public T getDados() {
        return dados;
    }
    public void setDados(T dados) {
        this.dados = dados;
    }
    public NoBinario<T> getNoEsq() {
        return noEsq;
    }
    public void setNoEsq(NoBinario<T> noEsq) {
        this.noEsq = noEsq;
    }
    public NoBinario<T> getNoDir() {
        return noDir;
    }
    public void setNoDir(NoBinario<T> noDir) {
        this.noDir = noDir;
    }
    @Override
    public String toString() {
        return "NoBinario{" + "dados=" + dados + '}';
    }
}
