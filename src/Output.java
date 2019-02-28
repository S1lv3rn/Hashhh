import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Output {

    public static void outputSlides(ArrayList<Slides> slides){
      //this prints out
      File f = new File("../output.txt");
      String str;

      try {
        BufferedWriter writer = new BufferedWriter(FileWriter(f));
        writer.write(slides.size());

        for (Slide s : slides) {
          str = "";

          for (Photos p : s.getPhotos()){
            str += p.ID() + " ";
          }
          writer.write(str);
        }
        wrter.close();

      } catch (IOException e) {
        e.printStackTrace();
      }


    }
}
