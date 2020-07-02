package obserwator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WyswietlaczPokojowy implements IWyswietlacz {

    @Override
    public void update(Date nowDate, SimpleDateFormat sdf) {
        System.out.println("W pokoju jest godzina " + sdf.format(nowDate) + ".");

    }
}
