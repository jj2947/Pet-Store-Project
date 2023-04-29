/* A program that simulates a pet shop, where pets can be purchased and sold. The program
tracks the cash balance of the shop and inventory of the store. The store can not have more
than 2 pets that are the same species. */

import java.util.*;

class Main {

  public static void main(String[] args) {

    // Creates new scanners
    Scanner userInput = new Scanner(System.in);
    Scanner details = new Scanner(System.in);
    Scanner name = new Scanner(System.in);
    Scanner choice = new Scanner(System.in);

    // Welcome message
    System.out.println(
        "\n"
            + " ____   ___ ______       _____ ______   ___   ____     ___       _____ __ __  _____"
            + " ______    ___  ___ ___ ");
    System.out.println(
        "|    \\ /  _]      |     / ___/|      | /   \\ |    \\   /  _]     / ___/|  |  |/ ___/|   "
            + "   |  /  _]|   |   |");
    System.out.println(
        "|  o  )  [_|      |    (   \\_ |      ||     ||  D  ) /  [_     (   \\_ |  |  (   \\_ |   "
            + "   | /  [_ | _   _ |");
    System.out.println(
        "|   _/    _]_|  |_|     \\__  ||_|  |_||  O  ||    / |    _]     \\__  ||  ~  |\\__  ||_| "
            + " |_||    _]|  \\_/  |");
    System.out.println(
        "|  | |   [_  |  |       /  \\ |  |  |  |     ||    \\ |   [_      /  \\ ||___, |/  \\ |  |"
            + "  |  |   [_ |   |   |");
    System.out.println(
        "|  | |     | |  |       \\    |  |  |  |     ||  .  \\|     |     \\    ||     |\\    |  |"
            + "  |  |     ||   |   |");
    System.out.println(
        "|__| |_____| |__|        \\___|  |__|   \\___/ |__|\\_||_____|      \\___||____/  \\___| "
            + " |__|  |_____||___|___|\n");

    // Asks the user for the name of the pet store and the initial balance
    System.out.print("Pet Store Name: ");
    String shopName = userInput.nextLine();
    System.out.print("Pet Store initial balance: ");
    String initialBalance = userInput.next();

    int shopBalance = -1;

    // Makes sure the initial balance is a valid number
    while (shopBalance == -1) {
      for (int i = 0; i < initialBalance.length(); i++) {
        if ((Character.isDigit(initialBalance.charAt(0)) == false)
            && initialBalance.charAt(0) != '$') {
          System.out.print("Please enter a valid balance: ");
          initialBalance = userInput.next();
          break;
        } else if (i >= 1 && (Character.isDigit(initialBalance.charAt(i)) == false)) {
          System.out.print("Please enter a valid balance: ");
          initialBalance = userInput.next();
          break;
        } else if (i == initialBalance.length() - 1) {
          if (initialBalance.charAt(0) == '$') {
            shopBalance = Integer.parseInt(initialBalance.substring(1));
          } else {
            shopBalance = Integer.parseInt(initialBalance);
          }
        }
      }
    }

    // Creates a new PetStore object
    PetStore shop = new PetStore(shopName, shopBalance);

    // Prints the list of commands
    System.out.println("\nBUY_PET                              Buy a pet from a supplier");
    System.out.println("SELL_PET                             Sell a pet to a customer");
    System.out.println("PRINT_INVENTORY                      Print the inventory of the store");
    System.out.println("PET_DETAILS                          Print the details of a pet");
    System.out.println("EXIT                                 Exit the program");
    System.out.println("HELP                                 Print the list of commands");

    // Asks the user for a command
    while (true) {

      final String COMMAND_PREFIX = "pet store system> ";
      System.out.print("\n" + COMMAND_PREFIX);
      String userChoice = choice.next();

      // Implements the user input
      switch (userChoice) {

          // Implements the BUY_PET command
        case "BUY_PET":

          // Asks the user for the pet name
          System.out.print("Enter pet name: ");
          String petName = details.next();
          // Makes sure the name is in title case
          petName = petName.toLowerCase();
          char firstChar = Character.toUpperCase(petName.charAt(0));
          petName = firstChar + petName.substring(1);

          // Asks the user for the pet species
          System.out.print("Enter pet species (Dog/Cat/Rabbit/Bird): ");
          String petSpecies = details.next();
          // Makes sure the species is in title case
          petSpecies = petSpecies.toLowerCase();
          firstChar = Character.toUpperCase(petSpecies.charAt(0));
          petSpecies = firstChar + petSpecies.substring(1);

          // Makes sure the species is valid
          while (!petSpecies.equals("Dog")
              && !petSpecies.equals("Cat")
              && !petSpecies.equals("Rabbit")
              && !petSpecies.equals("Bird")) {
            // Asks the user to enter a valid species
            System.out.print("Enter valid species: ");
            petSpecies = details.next();
            // Makes sure the species is in title case
            petSpecies = petSpecies.toLowerCase();
            firstChar = Character.toUpperCase(petSpecies.charAt(0));
            petSpecies = firstChar + petSpecies.substring(1);
          }

          // Asks the user for the pet breed
          System.out.print("Enter pet breed: ");
          String petBreed = details.next();
          // Makes sure the breed is in title case
          petBreed = petBreed.toLowerCase();
          petBreed = Character.toUpperCase(petBreed.charAt(0)) + petBreed.substring(1);

          // Asks the user for the pet age
          System.out.print("Enter pet age: ");
          String petAge = details.next();

          // Makes sure the age is a valid number
          for (int i = 0; i < petAge.length(); i++) {
            if (Character.isDigit(petAge.charAt(i)) == false) {
              System.out.print("Enter valid age: ");
              petAge = details.next();
              i = 0;
            }
          }
          int petAgeInt = Integer.parseInt(petAge);

          // Asks the user for the pet cost
          System.out.print("Enter pet cost price: ");
          String costPrice = details.next();

          int costPriceInt = -1;

          // Makes sure the cost price is a valid number
          for (int i = 0; i < costPrice.length(); i++) {
            if ((Character.isDigit(costPrice.charAt(0)) == false) && costPrice.charAt(0) != '$') {
              System.out.print("Please enter a valid balance: ");
              costPrice = details.next();
              i = 0;
            } else if (i >= 1 && (Character.isDigit(costPrice.charAt(i)) == false)) {
              System.out.print("Please enter a valid balance: ");
              costPrice = details.next();
              i = 0;
            } else if (i == costPrice.length() - 1) {
              if (costPrice.charAt(0) == '$') {
                costPriceInt = Integer.parseInt(costPrice.substring(1));
              } else {
                costPriceInt = Integer.parseInt(costPrice);
              }
            }
          }

          // Asks user for the pet gender
          System.out.print("Enter pet gender (Female/Male): ");
          String petGender = details.next();
          petGender = petGender.toUpperCase();

          // Makes sure the gender is valid
          if (!petGender.equalsIgnoreCase("female") && !petGender.equalsIgnoreCase("male")) {
            System.out.println("Enter valid gender: ");
            petGender = details.next();
            petGender = petGender.toUpperCase();
          }

          // Creates a new Pet object using factory design pattern
          Pet pet =
              PetFactory.createPet(
                  petName, petBreed, petSpecies, petAgeInt, costPriceInt, petGender);
          shop.purchasePet(pet);
          break;

          // Implements SELL_PET command
        case "SELL_PET":

          // Asks the user for the pet name
          System.out.print("Enter pet name: ");
          petName = name.nextLine();
          // Makes sure the name is in title case
          petName = petName.toLowerCase();
          petName = Character.toUpperCase(petName.charAt(0)) + petName.substring(1);
          shop.sellPet(petName);
          break;

          // Implements the PRINT_INVENTORY command
        case "PRINT_INVENTORY":
          shop.printInventoryDetails();
          break;

          // Implements the PET_DETAILS command
        case "PET_DETAILS":
          shop.printPetDetails();
          break;

          // Implements the HELP command
        case "HELP":
          System.out.println("\nBUY_PET                              Buy a pet from a supplier");
          System.out.println("SELL_PET                             Sell a pet to a customer");
          System.out.println(
              "PRINT_INVENTORY                      Print the inventory of the store");
          System.out.println("PET_DETAILS                          Print the details of a pet");
          System.out.println("EXIT                                 Exit the program");
          System.out.println("HELP                                 Print the list of commands");
          break;

          // Implements the EXIT command
        case "EXIT":
          System.exit(0);
          details.close();
          name.close();
          userInput.close();
          choice.close();
          break;

          // Prints an error message if the command is invalid
        default:
          System.out.println("Invalid command. Please try again.");
          break;
      }
    }
  }
}
