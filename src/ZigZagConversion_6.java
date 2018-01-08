import java.util.ArrayList;
import java.util.Arrays;

public class ZigZagConversion_6 {

    public String convert(String s, int numRows){
        String[] strings = new String[numRows];
        Arrays.fill(strings, "");
        if (numRows == 1 || s.length() < numRows){
            return s;
        }

        int row = 0, step = 0;
        for (int i = 0; i < s.length(); i++){
             strings[row] += s.charAt(i);
             if (row == 0){
                 step = 1;
             }
             if (row == numRows - 1){
                 step = -1;
             }
             row += step;
        }

        String result = "";
        for (String string : strings){
            result += string;
        }

        return result;
    }

}
