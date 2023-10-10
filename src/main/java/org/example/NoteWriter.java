package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NoteWriter {
    public void writeToFile(String note) {
        try {
            FileWriter fileWriter = new FileWriter("notes.txt", true);
            LocalDate now = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String formattedDate = now.format(formatter);
            fileWriter.write(now + " -> " + note + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
