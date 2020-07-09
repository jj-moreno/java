import java.util.ArrayList;
import java.util.Arrays;

public class Colors {

    String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        String[] colors = {"red", "yellow", "green", "blue", "pink", "black", "orange", "purple", "brown", "gold", "silver", "white"};
        ArrayList<String> colorStrArr = new ArrayList<String>();
        for (String color : colors) {
            for (String str : strings) {
                if (str.toLowerCase().startsWith(color)) {
                    colorStrArr.add(str);
                }
            }
        }
        if (colorStrArr.size() != 0) {
            return colorStrArr.toArray(new String[colorStrArr.size()]);
        }
        return new String[0];

    }

    public static void main(String[] args) {
        Colors code = new Colors();
        String[] colorfulArr = code.colorful(new String[]{"bluebird", "red herring", "yellow bumblebee", "black spider", "green monkey", "pink", "great gatsby", "feeding frenzy", "black bird", "widowmaker", "quran", "bible", "torah"});
        System.out.println("This is the Colors class");
        System.out.println("The colorful array:  " + Arrays.toString(colorfulArr));
    }


}