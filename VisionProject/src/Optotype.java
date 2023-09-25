import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Optotype extends Game {

    // declaring variables

    private int width;  // need to initialize

    private int length;  // need to initialize

    BufferedImage[] optotypeList;  // need to initialize based on number of optotypes we plan on having
    private int count = 0;  // keeps track of the number of optotypes we have recorded (facilitates constructor portion)

    public Optotype (BufferedImage img){
        optotypeList[count] = img;
        count++;
    }

    // Methods


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public BufferedImage[] getOptotypeList() {
        return optotypeList;
    }



}
