
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created"); }
            else {
                BufferedReader bufReader =
                        new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                line = bufReader.readLine();
                bufReader.close(); }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(line);
        }
    }

}