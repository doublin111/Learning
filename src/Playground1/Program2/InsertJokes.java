package Playground1.Program2;

import Playground1.Program1.InputUtility;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

class InsertJokes {

    private static final String fileName = "C:\\Users\\Alex\\Desktop\\jokes.txt";
    private static final File file = new File(fileName);

    static void game() {

        boolean stopInsertingJokes;
        int selection;

        System.out.println("Adding new jokes to the database is really simple, all you need to do is to write it down and then press Enter.");

        do {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
                bw.newLine();
                bw.write(insertJoke());
            } catch (IOException ioe) {
                System.out.println("IOException + " + ioe.getMessage());
            }

            System.out.println("You want to insert a new joke? \n1.Yes  2.No (Quit)");
            selection = InputUtility.validateRange(1, 2);

            if (selection == 1) {
                stopInsertingJokes = false;
            } else {
                stopInsertingJokes = true;
                System.out.println("Ok, bye bye!");
            }
        } while (!stopInsertingJokes);
    }

    private static String insertJoke() {

        Scanner input = new Scanner(System.in);
        String joke = input.nextLine();
        int newJokeNumber = getLastJokeNumber() + 1;

        return String.valueOf(newJokeNumber) + ". " + joke;
    }

    static String getJoke(int jokeNumber) {

        String joke = null;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains(String.valueOf(jokeNumber))) {
                    joke = scanner.nextLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("invalid file");
        }
        return joke;
    }

    private static String getLastJoke(File file) {

        RandomAccessFile fileHandler = null;

        try {
            fileHandler = new RandomAccessFile(file, "r");
            long fileLength = fileHandler.length() - 1;
            StringBuilder sb = new StringBuilder();

            for (long filePointer = fileLength; filePointer != -1; filePointer--) {
                fileHandler.seek(filePointer);
                int readByte = fileHandler.readByte();

                if (readByte == 0xA) {
                    if (filePointer == fileLength) {
                        continue;
                    }
                    break;

                } else if (readByte == 0xD) {
                    if (filePointer == fileLength - 1) {
                        continue;
                    }
                    break;
                }

                sb.append((char) readByte);
            }

            return sb.reverse().toString();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (fileHandler != null)
                try {
                    fileHandler.close();
                } catch (IOException e) {
                /* ignore */
                }
        }
    }

    static int getLastJokeNumber() {
        String lastJoke = getLastJoke(file);
        assert lastJoke != null;
        String[] parts = lastJoke.split(Pattern.quote("."));
        return Integer.parseInt(parts[0]);
    }
}
