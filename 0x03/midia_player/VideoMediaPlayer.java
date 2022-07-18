public class VideoMediaPlayer implements AdvancedMediaPlayer {

  @Override
  public void reproduzirVlc(String nameVLC) {
    System.out.printf("Reproduzindo VLC: %s", nameVLC);
  }

  @Override
  public void reproduzirMP4(String nameMP4) {
    System.out.printf("Reproduzindo MP4: %s", nameMP4);
  }
}
