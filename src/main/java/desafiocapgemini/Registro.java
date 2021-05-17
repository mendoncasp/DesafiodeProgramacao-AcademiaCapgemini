package desafiocapgemini;

public class Registro {
    //Atributos
    private String anuncio;
    private String cliente;
    private int dataInicio;
    private int dataFim;
    private double investimento;

    //Métodos
    public Registro (String nome, String nome1, int data, int data1, double inv){
        this.anuncio = nome;
        this.cliente = nome1;
        this.dataInicio = data;
        this.dataFim = data1;
        this.investimento = inv;
    }
}
