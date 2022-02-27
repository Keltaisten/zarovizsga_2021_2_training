package hu.nive.ujratervezes.zarovizsga.people;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {
    public int getNumberOfMales(String path) {
        int count = 0;
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            br.readLine();
            while (br.ready()) {
                String line = br.readLine();
                String[] fields = line.split(",");
                if (fields[4].equals("Male")) {
                    count++;
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot find file", ioException);
        }
        return count;
    }
}
