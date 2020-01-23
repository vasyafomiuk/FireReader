package app.filereader;

import app.filereader.models.Person;
import app.filereader.utils.Parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Person> data = new ArrayList<>();
        Parser parser = new Parser();

        String filePath = args != null ? "src/test/resources/test_data/test_data1.txt" : args[0];
        try {
            FileInputStream io = new FileInputStream(filePath);
            Scanner scanner = new Scanner(io);

            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                data.add(parser.parseRow(row));
            }

            parser.sortType1(data);
            for (Person p : data) {
                p.printPersonsInfo();
            }

            System.out.println();
            parser.sortType2(data);

            for (Person p : data) {
                p.printPersonsInfo();
            }

            System.out.println();
            parser.sortType3(data);

            for (Person p : data) {
                p.printPersonsInfo();
            }

            io.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
