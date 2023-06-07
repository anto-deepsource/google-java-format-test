public class Format {
  public static void main(String[] args) {
    Map.Entry<URL, ConfigData>[] entries =
        (Map.Entry<URL, ConfigData>[]) configs.entrySet().toArray(new Map.Entry[0]);
  }
}
