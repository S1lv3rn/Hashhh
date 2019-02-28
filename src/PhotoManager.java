import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class PhotoManager {

    public void process(ArrayList<Photos> photos) {
        Output o = new Output();
        ArrayList<Slide> s = new ArrayList<>();
        for (Photos p : photos) {
          s.add(new Slide());
          s.get(0).addPhoto(p);
        }

        o.outputSlides(s);
    }

    // public int calculateTotal(ArrayList<Slide> slideShow){
    //   int total = 0;
    //   for(int i = 0; i < slideShow.size(); i++){
    //     total += interest
    //   }
    // }

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
        tags1.size();
        return 0;
    }

    //finds out the minimum
    public int min(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        return num2;
    }
}
