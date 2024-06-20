package projetoarvore;

import java.util.Objects;

public class Objeto extends ObjetoArvore<Objeto> {
    Integer meuValor;
    public Objeto(Integer meuValor){
        this.meuValor = meuValor;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto obj = (Objeto) o;
        return Objects.equals(meuValor, obj.meuValor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }
    @Override
    public int compareTo(Objeto outro) {
        return Integer.compare(this.meuValor, outro.meuValor);
    }
    @Override
    public String toString() {
        return meuValor.toString();
    }
}

