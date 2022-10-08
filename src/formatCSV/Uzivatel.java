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
}
