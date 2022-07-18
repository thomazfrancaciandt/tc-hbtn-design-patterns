public class MediaPlayerAdapter implements MediaPlayer {
  private AdvancedMediaPlayer advancedMediaPlayer;

  public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
    this.advancedMediaPlayer = advancedMediaPlayer;
  }

  public MediaPlayerAdapter(TipoMedia tipoMedia) {
    if (tipoMedia != TipoMedia.MP3) {
      this.advancedMediaPlayer = new VideoMediaPlayer();
    }
  }

  public MediaPlayerAdapter() {}

  @Override
  public void reproduzir(TipoMedia tipoMedia, String fileName) {
    if (tipoMedia == TipoMedia.VLC) {
      System.out.printf("Reproduzindo %s: %s", tipoMedia.name(), fileName);
    }
  }
}
