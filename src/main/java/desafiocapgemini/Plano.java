package desafiocapgemini;

import java.util.ArrayList;
import java.util.List;

public class Plano implements ICalculadora<Calculadora>{

    private List<Calculadora> plano = new ArrayList<>();

    @Override
    public void Registrar(Calculadora objeto) {
        plano.add(objeto);
        System.out.println(plano); //Testar os registros
    }

    @Override
    public void Exibir(int posicao) {
        System.out.println("Alcance atingido");
        System.out.println("Visualização / Click / Compartilhamento / Investimento Total");
        System.out.println(plano.get(posicao));
    }
}
