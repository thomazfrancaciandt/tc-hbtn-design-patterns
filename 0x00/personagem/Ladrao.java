public class Ladrao extends Personagem {

    public Ladrao(
            String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);

        if ((destreza < forca) || (destreza < inteligencia)) {
            throw new IllegalArgumentException("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (this.getForca() * 0.5)
                + (this.getDestreza() * 0.35)
                + (this.getVigor() * 0.1)
                + (this.getInteligencia() * 0.05);
    }
}