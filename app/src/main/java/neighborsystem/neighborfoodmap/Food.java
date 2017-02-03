
        package neighborsystem.neighborfoodmap;

/**
 * Created by Jaewoo Kim on 2017-01-19.
 */


public class Food {


    private int _id;
    private String title;
    private String address;
    private String image1;
    private String image2;

    public Food(int _id, String title, String address, String image1, String image2){
        this._id = _id;
        this.title =title;
        this.address=address;
        this.image1 = image1;
        this.image2 = image2;
    }


    public int getId() {
        return this._id;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getImage1() {
        return image1;
    }

    public String getImage2() {
        return image2;
    }


}

