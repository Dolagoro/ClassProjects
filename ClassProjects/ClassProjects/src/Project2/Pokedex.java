package Project2;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Pokedex {

    public static void main(String[] args) {

        ArrayList<Pokemon> pokedex = new ArrayList<>(); //sorting our poketable monsters

        // reading files from the csv file
        try {
            Scanner fileScanner = new Scanner(new File("pokemon.csv"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                // read poke stats
                String name = parts[1].trim();
                String type = parts[2].trim();
                int hp = Integer.parseInt(parts[5].trim());
                int attack = Integer.parseInt(parts[6].trim());
                int defense = Integer.parseInt(parts[7].trim());

                // creating pokemon objects
                Pokemon pokemon = new Pokemon(name, type, hp, attack, defense);
                pokedex.add(pokemon);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // menu
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Display all Pokemon");
            System.out.println("2. Find Pokemon by name");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // show all pokemon
                    for (Pokemon pokemon : pokedex) {
                        System.out.println(pokemon);
                    }
                    break;
                case 2:
                    // search and show spec pokemon
                    System.out.print("Enter Pokemon name: ");
                    String name = scanner.nextLine();
                    boolean found = false;
                    for (Pokemon pokemon : pokedex) {
                        if (pokemon.getName().equalsIgnoreCase(name)) {
                            System.out.println(pokemon);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Pokemon not found!");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
