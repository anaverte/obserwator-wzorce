package obserwator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ZegarCentralny extends Thread implements IZegarCentralny {

    private final List<IWyswietlacz> wyswietlacze = new ArrayList<>();

    private volatile boolean running = true;

    public synchronized void zatrzymajZegar() {
        this.running = false;
    }

    @Override
    public void dodajWyswietlacz(IWyswietlacz wyswietlacz) {
        wyswietlacze.add(wyswietlacz);
    }

    @Override
    public void usunWyswietlacz(IWyswietlacz wyswietlacz) {
        wyswietlacze.remove(wyswietlacz);
    }

    @Override
    public void notify1(Date nowDate, SimpleDateFormat sdf) {
        System.out.println("");
        for (IWyswietlacz w : wyswietlacze) {
            w.update(nowDate, sdf);
        }
    }

    @Override
    public void run() {
        Date nowDate;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        while (running) {
            try {
                nowDate = new Date();
                notify1(nowDate, sdf);
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ZegarCentralny.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
