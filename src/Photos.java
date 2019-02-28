public class Photos{
    private String Orienation;
    private int ID;
    private ArrayList<String> tags = new ArrayList<>();

    Photos(String Orienation, int ID, ArrayList<String> tags ){
        this.Orienation = Orienation;
        this.ID = ID;
        this.tags = tags;

    }

    public String getOrienation() {return orienation;}
    public int ID() {return ID;}

    public ArrayList<String> getTags() {
        return tags;
    }
}