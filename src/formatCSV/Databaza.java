package formatCSV;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Databaza {
    private final DefaultListModel<Uzivatel> uzivatelia;
    private final Path subor;

    public Databaza(Path subor)
    {
        this.uzivatelia = new DefaultListModel<>();
        this.subor = subor;
    };

    public void pridajUzivatela(String meno, int vek, LocalDate registrovany)
    {
        uzivatelia.addElement(new Uzivatel(meno, vek, registrovany));
    };

    public List<Uzivatel> vratVsetky()
    {
        return Collections.list(uzivatelia.elements());
    };

    public ListModel<Uzivatel> getModel()
    {
        return uzivatelia;
    };

    public void uloz() throws IOException
    {

    };

    public void nacitaj() throws IOException
    {

    };







}
