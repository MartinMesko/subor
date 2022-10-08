package novySubor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class PathStyle {
    public static void main(String[] args) {
        Path path = Path.of(System.getProperty("user.home"),"itnetwork", "newapi.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path,"Nový riadok" + System.lineSeparator(), StandardOpenOption.CREATE_NEW, StandardOpenOption.TRUNCATE_EXISTING);
            Files.writeString(path,"tento riadok je na ďalšom riadku" + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(path,"do tretice!!!" + System.lineSeparator(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.out.println("Chyba pri zápise do súboru" + ex.getMessage());
        }
        try {
            Files.writeString(path, "Ďalšie riadky" + System.lineSeparator(), StandardOpenOption.APPEND);

        } catch (IOException ex)
        {
            System.out.println("Zápis sa nepodaril");
        }
        try {
            List<String> citanie = Files.readAllLines(path);
            citanie.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Chyba pri čítaní súboru" + e.getMessage());
        }
    }
}
