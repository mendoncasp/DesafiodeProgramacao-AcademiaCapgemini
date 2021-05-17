package desafiocapgemini;

public class Calculadora {

    private int totVisualizacao;
    private int totClick;
    private int totComp;
    private int investimentoTotal;

    public Calculadora (int valor){
        int totVisu=0, totClique=0, totCom=0;
            int visualizaAnuncio = valor * 30;
            while (visualizaAnuncio >= 100) {
                totVisu += visualizaAnuncio;
                int click = (int) (Math.floor(visualizaAnuncio / 100) * 12);
                totClique += click;
                int comp;
                int compFinal;
                if (click >= 20) {
                    comp = (int) (Math.floor(click / 20) * 3);
                    compFinal = (int) (comp - (Math.floor(comp / 4)));
                    totCom += compFinal;
                } else {
                    break;
                }
                visualizaAnuncio = compFinal * 40;
            }

            this.totVisualizacao = totVisu;
            this.totClick = totClique;
            this.totComp = totCom;
            this.investimentoTotal = valor;
    }
}
