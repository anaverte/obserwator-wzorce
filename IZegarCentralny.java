package obserwator;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface IZegarCentralny {

    void dodajWyswietlacz(IWyswietlacz wyswietlacz);

    void usunWyswietlacz(IWyswietlacz wyswietlacz);

    void notify1(Date nowDate, SimpleDateFormat sdf);
}
