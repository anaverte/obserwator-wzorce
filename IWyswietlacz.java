package obserwator;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface IWyswietlacz {

    public void update(Date nowDate, SimpleDateFormat sdf);
}
