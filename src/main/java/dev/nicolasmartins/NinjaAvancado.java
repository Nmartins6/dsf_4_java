package dev.nicolasmartins;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    public String especialidade;


    public NinjaAvancado(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade, String especialidade) {
        super(nome, idade, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + this.especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando habilidade avançada com especialidade: " + especialidade +
                " de tipo: " + tipoHabilidade);
    }

}
