package dev.nicolasmartins;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("==========NINJA BÁSICO==========\n");

        NinjaBasico ninjaBasico = new NinjaBasico("Konohamaru Sarutobi", 15, "ser um inútil", NinjaBasico.TipoHabilidade.NINJUTSU);
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        System.out.println("\n\n========NINJA AVANÇADO=========\n");

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Galvão Bueno", 65, "RRRRONALDINHO", NinjaBasico.TipoHabilidade.GENJUTSU, "TAFAREEEEEEEEEEEEEL");
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }
}
