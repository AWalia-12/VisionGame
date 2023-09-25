import java.awt.image.BufferedImage;

public class Image extends Game{


    // declaring variables

    private int width;  // need to initialize

    private int length;  // need to initialize

    BufferedImage[] imageList;  // need to initialize based on number of images we plan on having
    private int count = 0;  // keeps track of the number of images we have recorded (facilitates constructor portion)

    public Image (BufferedImage img){
        imageList[count] = img;
        count++;
    }

    // Methods


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public BufferedImage[] getImageList() {
        return imageList;
    }



}
