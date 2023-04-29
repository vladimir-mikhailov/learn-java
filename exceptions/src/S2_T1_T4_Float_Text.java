import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_T1_T4_Float_Text {
    public static void main(String[] args) {
        String line = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(getFloat(bufferedReader));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static float getFloat(BufferedReader bufferedReader) throws Exception {
        System.out.print("Введите float: ");
        try {
            String s = bufferedReader.readLine();
            if (s.isEmpty()) {
                throw new Exception("Введена пустая строка. Так нельзя. Досвидули.");
            }
            return Float.parseFloat(s);
        } catch (IOException e) {
            throw new IOException();
        } catch (NumberFormatException e) {
            System.out.println("Введён не Float");
            return getFloat(bufferedReader);
        }
    }

}
