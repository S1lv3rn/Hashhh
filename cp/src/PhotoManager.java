import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class PhotoManager {

    public void process(ArrayList<Photos> photos) {
        Output o = new Output();
        ArrayList<Slide> s = new ArrayList<>();
        for (Photos p : photos) {
          Slide sl = new Slide();
          s.add(sl);

          sl.addPhoto(p);
        }



        o.outputSlides(getBest(s));
    }

    public ArrayList<Slide> getBest(ArrayList<Slide> slides){
      ArrayList<Slide> bestList = new ArrayList<>();
      for(int i = 0; i < slides.size(); i++){

        Slide sl = slides.get(i);
        bestList.add(slides.get(i));
        slides.remove(i);
        int max = 0;
        Slide bestSlide = slides.get(0);

        for(Slide s: slides){
          if(interest_factor(sl, s) > max) {
            max = interest_factor(sl, s);
            bestSlide = s;
          }
        }
        bestList.add(bestSlide);

      }

      return bestList;


    }



    public int interest_factor(Slide slide1, Slide slide2){
        int commonTags = compare(slide1, slide2, true);
        int uncommonTags12 = compare(slide1, slide2, false);
        int uncommonTags21 = compare(slide1, slide2, false);

        //finding out the minimum of all the 3
        int interestFactor = min(commonTags, uncommonTags12);
        interestFactor = min(interestFactor, uncommonTags21);
        return interestFactor;
    }

    public int compare(Slide slide1, Slide slide2, boolean common){
        //Finds out either the similar or the dissimilar tags
        Set<String> tags1 = new HashSet<>(slide1.getTags());
        Set<String> tags2 = new HashSet<>(slide2.getTags());
        if(common){
            tags1.removeAll(tags2);
            return slide1.getTags().size() - tags1.size();
        }
        tags1.removeAll(tags2);
        return tags1.size();
    }

    //finds out the minimum
    public int min(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        return num2;
    }
}
