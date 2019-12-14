package errorssextentions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CheckedUncheckedBorder {
    public static void main(String[] args) {
        double value = Double.parseDouble("42.05");
        System.out.println(value);
        //NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        try {
            value = (double)format.parse("111,142.05");
            System.out.println(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
