package dev.nicolasmartins;

public class NinjaBasico implements Ninja {

    public String nome;
    public int idade;
    public String habilidade;
    public TipoHabilidade tipoHabilidade;

    public enum TipoHabilidade {
        TAIJUTSU,
        NINJUTSU,
        GENJUTSU,
        KATON,
        RINNEGAN
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome +
                "\nIdade :" + this.idade +
                "\nHabilidade: " + this.habilidade +
                "\nTipo de Habilidade: " + this.tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + this.nome + " executou " + this.habilidade);
    }

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }
}
