package abstracaoPOO;

public class Cadeira {
    private String material;
    private String cor;
    private double altura;
    private String tipo;
    private boolean estofamento;

    public Cadeira(String material, String cor, double altura, String tipo, boolean estofamento) {
        this.material = material;
        this.cor = cor;
        this.altura = altura;
        this.tipo = tipo;
        this.estofamento = estofamento;
    }

    public void ajustarAltura(double novaAltura) {
        this.altura = novaAltura;
    }

    public void girar() {
        System.out.println("Girando a cadeira");
    }

    public void reclinar() {
        System.out.println("Cadeira reclinada");
    }

    public void suportarPeso(double peso) {
        System.out.println("Suportando peso de " + peso + "kg");
    }
}
