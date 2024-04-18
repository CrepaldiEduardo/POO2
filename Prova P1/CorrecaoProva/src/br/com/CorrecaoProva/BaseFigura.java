package br.com.CorrecaoProva;

public class BaseFigura {

    public String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BaseFigura(String cor) {
        this.cor = cor;
    }

    public BaseFigura() {
    }

    @Override
    public String toString() {
        return "BaseFigura [cor=" + cor + "]";
    }
        
}
