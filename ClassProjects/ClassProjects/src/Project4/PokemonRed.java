package Project4;

import Project2.Pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//best pokemon game ever
public class PokemonRed {



        public static void main(String[] args) {

            ArrayList<Pokemon> allPokemon = new ArrayList<>();
            try {
                Scanner fileScanner = new Scanner(new File("pokemon.csv"));
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(",");
                    Pokemon pokemon = new Pokemon(parts[1].trim(), parts[2].trim(), Integer.parseInt(parts[5].trim()), Integer.parseInt(parts[6].trim()), Integer.parseInt(parts[7].trim()));
                    allPokemon.add(pokemon);
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            Collections.shuffle(allPokemon); // shuffle all pokemons

            Stack<Pokemon> playerStack = new Stack<>();
            Stack<Pokemon> computerStack = new Stack<>();

            // give 10 cards to each pl
            for (int i = 0; i < 10; i++) {
                playerStack.push(allPokemon.get(i));
                computerStack.push(allPokemon.get(i + 10));
            }

            int playerScore = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Round #: " + (i + 1));
                Pokemon playerPokemon = playerStack.pop();
                System.out.println("Player: " + playerPokemon);

                Pokemon computerPokemon = computerStack.pop();
                System.out.println("Computer: " + computerPokemon);

                System.out.println("##### fight! ######");

                if (playerPokemon.getAttack() > computerPokemon.getDefense()) {
                    playerScore++;
                    System.out.println("Player wins this round.\n");
                } else if (playerPokemon.getAttack() < computerPokemon.getDefense()) {
                    System.out.println("Computer wins this round.\n");
                } else {
                    System.out.println("It's a tie!\n");
                }
            }

            System.out.println("The battle has come to an end. Player score is: " + playerScore);

        }
    }
