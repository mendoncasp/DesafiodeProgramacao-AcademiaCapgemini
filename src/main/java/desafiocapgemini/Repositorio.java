package desafiocapgemini;

import java.util.ArrayList;
import java.util.List;

public class Repositorio implements IRegistro<Registro>{

    private List<Registro> registrar = new ArrayList<>();

    @Override
    public void Registrar(Registro objeto) {
        registrar.add(objeto);
        System.out.println("Anúncio registrado com sucesso!!");
        System.out.println(registrar); //Esse comando foi utilizado para testar os registros
    }

    @Override
    public int BuscaNome(String nome) {
        int posicao = registrar.indexOf(nome);
        System.out.println(registrar.get(posicao));
        System.out.println();
        return posicao;
    }

    @Override
    public int BuscaData(int data, int data1) {
        int posicao = 0;
        boolean temInicio = registrar.contains(data);
        boolean temFim = registrar.contains(data1);
        if ((temInicio && temFim)==true){
            posicao = registrar.indexOf(data);
            System.out.println(registrar.get(posicao));
            System.out.println();
        }
        return posicao;
    }
}
