import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
public class Slide {

    private ArrayList<Photos> photos = new ArrayList<>();
    private Set<String> tags = new HashSet<>();


    public ArrayList<String> getPhotos() {
        return  photos;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void addPhoto(Photos p) {
        photos.add(p);
        tags.addAll(photos.getTags());
    }

    public boolean CheckSize() {
        if(photos.size() <= 2){
            return true;

        } else{
            return false;
        }
    }
}
