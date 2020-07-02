package obserwator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WyswietlaczKuchenny implements IWyswietlacz {

    @Override
    public void update(Date nowDate, SimpleDateFormat sdf) {
        System.out.println("W kuchni jest godzina " + sdf.format(nowDate) + ".");
    }
}
