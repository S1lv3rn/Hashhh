import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Output {

    public static void outputSlides(ArrayList<Slide> slides){
      //this prints out
      File f = new File("../output.txt");
      String str;

      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(f));
        writer.write(slides.size() + "\n");

        for (Slide s : slides) {
          str = "";

          for (Photos p : s.getPhotos()){
            str += p.ID() + " ";
          }
          writer.write(str + "\n");
        }
        writer.close();

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
}
