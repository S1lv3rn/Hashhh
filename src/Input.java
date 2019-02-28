import java.io.*;
import java.util.ArrayList;

public class Input {

    public static void main(String[] args) {

        File file = null;
        Input main = new Input();
        String input;

        if (args.length != 0) {
            input = args[0];
            file = new File(input);
        } else {

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

        }

    }

    public ArrayList<Photos> getPhotos (File file) {
        ArrayList<Photos> photos = new ArrayList<>();

        int counter = 0;
        BufferedReader reader;


        try {
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(" ");
                String orientation = info[0];
                int id = counter;
                ArrayList<String> tags = new ArrayList<>();
                int noTag = Integer.parseInt(info[1]);

                for (int i = 2; i < noTag + 2; i++) {
                    tags.add(info[i]);
                }
                counter++;

                Photos photo = new Photos(orientation, id, tags);
                photos.add(photo);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return photos;
    }

}