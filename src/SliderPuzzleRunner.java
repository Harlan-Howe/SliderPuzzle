import javax.swing.*;
import java.awt.*;

public class SliderPuzzleRunner
{
    public void main()
    {
        System.out.println("Start the program!");

        for (int r = 1; r <= 4; r++)
            for (int c = 1; c <= 4; c++)
            {
                ImageIcon tempIcon = new ImageIcon("SealParts/Kinkaid Seal-0" + r + "-0" + c + ".png");
                Image imageToUse = tempIcon.getImage();
                // store imageToUse in a long term variable.
            }
    }
}
