public class Slides{

    private ArrayList<String> photos = new ArrayList<>();
    private ArrayList<String> tags = new ArrayList<>();

    Slides(ArrayList<String> photos,ArrayList<String> tags){
        this.photos=photos;
        this.tags=tags;
    }

    public ArrayList<String> getPhotos() {
        return  photos;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void addPhoto(Photos p) {
        photos.add(p);
    }

    public boolean CheckSize() {
        if(photos.size()=<2){
            return true;
        }

         else{
            return false;
        }
    }



}
