import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    void readFile() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        String text = "This is Demo";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
}

class Test {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            rw.saveFile();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        System.out.println("HEllo");
    }
}
