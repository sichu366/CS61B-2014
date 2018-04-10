import java.io.*;

class Nuke2 {
  public static void main(String[] arg) throws Exception {
    BufferedReader keyboard;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    String input = keyboard.readLine();
    String result = input.substring(0, 1) + input.substring(2);
    System.out.println(result);

  }
}
