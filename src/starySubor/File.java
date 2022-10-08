package starySubor;

import java.io.*;


public class File {
    public static void main(String[] args) {
        java.io.File file = new java.io.File(System.getProperty("user.home") + java.io.File.separator + "itnetwork" + java.io.File.separator + "" +
                "oldapi.txt");
        file.getParentFile().mkdirs();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
            bw.newLine();
            bw.write("Prvý riadok");
            bw.newLine();
            bw.write("Druhý riadok");
            bw.newLine();
            bw.write("Tretí riadok");
            bw.newLine();
            bw.flush();


        } catch (Exception e) {
            System.out.println("Do suboru sa nepodarilo zapísať.");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true)))
        {
            bw.newLine();
            bw.write("Pripísaný nový riadok");
            bw.flush();

        } catch (Exception e)
        {
            System.out.println("Do suboru sa nepodarilo zapísať.");
        }
        System.out.println("Vypisujem celý súbor");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
            }
        }catch (Exception e)
        {
            System.out.println("Chyba pri čítaní zo súboru");
        }
    }
}