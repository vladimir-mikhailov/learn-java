import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class S1_T1_ThreeExceptions {

    public static void main(String[] args) throws FileNotFoundException {
        getDivisionByZeroException();
        getOutOfBoundsException();
        getNoFileException();
    }

    public static void getDivisionByZeroException(){
        System.out.println(1/0);
    }

    public static void getOutOfBoundsException(){
        List<Integer> list = Arrays.asList(0,1,2);
        System.out.println(list.get(3));
    }

    public static void getNoFileException() throws FileNotFoundException {
        FileReader reader = new FileReader("1.txt");
    }

}
