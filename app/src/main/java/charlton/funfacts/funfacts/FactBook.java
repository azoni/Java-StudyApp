package charlton.funfacts.funfacts;

import java.util.Random;

/**
 * Created by Charlton on 2/16/2016.
 */
public class FactBook {
    // Fields (members variables) - properties about the object
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver",
            "You are born with 300 bones; by the time you are an adult you will have 206",
            "It takes about 8 minutes for light from the sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, ot tales 66 days to form a new habit",
            "Mammoths still walked the earth when the Great Pyramid was being built."};
    // methods - actions object can take
    public String getFact(){
        String fact = "";
        // Randomly select a fact
        Random r = new Random();
        int num = r.nextInt(mFacts.length);
        fact = mFacts[num];

        return fact;
    }
}
