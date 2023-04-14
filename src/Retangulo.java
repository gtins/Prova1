public class Retangulo {
    private int largura;
    private int altura;

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public int calcularArea() {
        return largura * altura;
    }

    public int calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

}
