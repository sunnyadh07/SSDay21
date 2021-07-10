import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DOJBackground implements Runnable{
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Salma\\IdeaProjects\\JavaBootCamp\\Day21-SceneBuilder_Algorithms\\Homework\\src\\DepartmentofJustice.txt"));
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Error when running background check with Department of Justice:" + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(ThreadColor.ANSI_CYAN + "Reading from Department of justice");
    }

    public void start() {
    }
}
