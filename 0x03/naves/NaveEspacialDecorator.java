public class NaveEspacialDecorator extends NaveEspacial {
  private NaveEspacial naveDecorada;

  public NaveEspacialDecorator(NaveEspacial naveDecorada) {
    super(naveDecorada.getSaude(), naveDecorada.getAtaque());
    this.naveDecorada = naveDecorada;
  }

  @Override
  public int getSaude() {
    return this.naveDecorada.getSaude();
  }

  @Override
  public int getAtaque() {
    return this.naveDecorada.getAtaque();
  }
}
