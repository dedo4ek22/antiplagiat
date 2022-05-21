import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("reader.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("writer.txt"))){
            String s = reader.readLine();
            String m = Main.replace(s);
            writer.write(m);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String replace(String text){
        return text
                .replaceAll("а", "a")
                .replaceAll("А", "A")
                .replaceAll("е", "e")
                .replaceAll("О", "O")
                .replaceAll("о", "o")
                .replaceAll("Т", "T")
                .replaceAll("р", "p")
                .replaceAll("Р", "P")
                .replaceAll("С", "C")
                .replaceAll("с", "c")
                .replaceAll("Н", "H")
                .replaceAll("М", "M")
                .replaceAll("В", "B")
                .replaceAll("К", "K")
                .replaceAll("х", "x")
                .replaceAll("Х", "X")
                .replaceAll("Е", "E");
    }
}
