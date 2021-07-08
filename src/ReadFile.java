import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("Kanto-Route-List.txt");
            Scanner myReader = new Scanner(myObj);

            List<String> list = new ArrayList<>();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);


            //    System.out.println(data);
            }

            Random random = new Random();
            int num = random.nextInt(list.size());
            int kanto = random.nextInt(98);

            String result = list.get(num);
            System.out.println(result);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //Route info here:
    //https://bulbapedia.bulbagarden.net/wiki/Category:FireRed_and_LeafGreen_locations
    }

