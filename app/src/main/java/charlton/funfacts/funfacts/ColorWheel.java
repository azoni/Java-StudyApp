package charlton.funfacts.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Charlton on 2/16/2016.
 */
public class ColorWheel {
    // Fields (members variables) - properties about the object
    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7" // light gray
    };
    // methods - actions object can take
    public int getColor(){
        String color;
        // Randomly select a fact
        Random r = new Random();
        int num = r.nextInt(mColors.length);
        color = mColors[num];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}

