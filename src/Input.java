import java.io.*;
import java.util.ArrayList;

public class Input {

    public static void main(String[] args) {
        String inputA = "/cs/home/jjyc/Documents/hashcode/Hashhh/a_example.txt";
        String inputB = "/cs/home/jjyc/Documents/hashcode/Hashhh/b_lovely_landscapes.txt";
        String inputC = "/cs/home/jjyc/Documents/hashcode/Hashhh/c_memorable_moments.txt";
        String inputD = "/cs/home/jjyc/Documents/hashcode/Hashhh/d_pet_pictures.txt";
        String inputE = "/cs/home/jjyc/Documents/hashcode/Hashhh/e_shiny_selfies.txt";

        ArrayList<String> inputFiles = new ArrayList<>();
        inputFiles.add(inputA);
        inputFiles.add(inputB);
        inputFiles.add(inputC);
        inputFiles.add(inputD);
        inputFiles.add(inputE);

        int counter;

        for (String files : inputFiles) {
            File file= new File(files);
            BufferedReader reader;


            try {
                reader = new BufferedReader(new FileReader(file));

                while (reader.readLine() != null) {

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}