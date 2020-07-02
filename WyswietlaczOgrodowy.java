package obserwator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WyswietlaczOgrodowy implements IWyswietlacz {

    @Override
    public void update(Date nowDate, SimpleDateFormat sdf) {
        System.out.println("W ogrodzie jest godzina " + sdf.format(nowDate) + ".");
    }
}
