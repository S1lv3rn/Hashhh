import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Output {

    public static void outputSlides(ArrayList<Slides> slides){
      //this prints out
      String filename = "output";
      File f = new File("../output.txt");
      BufferedWriter writer = new BufferedWriter(FileWriter(f));

      try {
        BufferedWriter writer = new BufferedWriter(FileWriter(f));
        writer.write(slides.size());

        for (Slide s : slides) {
          String str = "";

          for (Photos p : s.getPhotos()){
            str += p.ID() + " ";
          }
          writer.write(str);
        }


      }


    }
}
