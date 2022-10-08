package formatCSV;

import java.time.LocalDate;

public class Uzivatel {
    private final String meno;
    private final int vek;
    private final LocalDate registrovany;

    public Uzivatel(String meno, int vek, LocalDate registrovany) {
        this.meno = meno;
        this.vek = vek;
        this.registrovany = registrovany;
    }

    public String getMeno() {
        return meno;
    }

    public int getVek() {
        return vek;
    }

    public LocalDate getRegistrovany() {
        return registrovany;
    }

    @Override
    public String toString() {
        return meno;
    }


}
