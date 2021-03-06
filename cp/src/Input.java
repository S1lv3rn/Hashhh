import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;


public class Input {

    public static void main(String[] args) {

        File file = null;
        Input main = new Input();
        String input = "";

        PhotoManager processa = new PhotoManager();
        ArrayList<Photos> list = new ArrayList<>();

        if (args.length > 0) {
            input = args[0];

            //try {
              file = new File(input);
            // } catch (FileNotFoundException e) {
            //   System.err.println(e.getMessage());
            // }
            list = main.getPhotos(file);
            processa.process(list);

        } else {

            // String inputA = "../a_example.txt";
            String inputB = "../b_lovely_landscapes.txt";
            // String inputC = "../c_memorable_moments.txt";
            // String inputD = "../d_pet_pictures.txt";
            // String inputE = "../e_shiny_selfies.txt";
            ArrayList<String> inputFiles = new ArrayList<>();
            //inputFiles.add(inputA);
            inputFiles.add(inputB);
            // inputFiles.add(inputC);
            // inputFiles.add(inputD);
            // inputFiles.add(inputE);

            for (String i : inputFiles) {
              file = new File(i);
              list = main.getPhotos(file);
            }
            processa.process(list);
        }





    }

    public ArrayList<Photos> getPhotos (File file) {
        ArrayList<Photos> photos = new ArrayList<>();

        int counter = 0;
        BufferedReader reader;


        try {
            reader = new BufferedReader(new FileReader(file));

            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(" ");
                String orientation = info[0];
                int id = counter;
                HashSet<String> tags = new HashSet<>();
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
