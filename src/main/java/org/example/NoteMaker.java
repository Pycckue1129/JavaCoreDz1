package org.example;

import java.util.Scanner;

public class NoteMaker {
    public void takeNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();

        NoteWriter noteWriter = new NoteWriter();
        noteWriter.writeToFile(note);
    }
}
