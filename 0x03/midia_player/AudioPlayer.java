public class AudioPlayer implements MediaPlayer {

  @Override
  public void reproduzir(TipoMedia tipoMedia, String fileName) {
    if (tipoMedia == TipoMedia.MP3) {
      System.out.printf("Reproduzindo MP3: %s", fileName);
    } else {
      MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter();
      mediaPlayerAdapter.reproduzir(tipoMedia, fileName);
    }
  }
}
