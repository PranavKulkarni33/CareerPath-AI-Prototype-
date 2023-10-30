package immersiveGames;

import java.util.Scanner;
import java.util.ArrayList;

public class EnchantedRealmGame {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> playerDecisions = new ArrayList<>();
        String decision1a = "";
        String decision1b = "";
        String decision2a = "";
        String decision2b = "";
        String decision3a = "";
        String decision3b = "";

        // Present the immersive storyline to the player
        System.out.println("Welcome to the Enchanted Realm of Varadia!");
        System.out.println("You, a brave traveler, are summoned to undertake a mystical quest.");

        // First decision point
        System.out.println("You encounter the mystical Tree of Challenges.");
        System.out.println("Do you wish to solve the cryptic puzzle? (yes or no)");
        String decision1 = scanner.nextLine();
        playerDecisions.add(decision1);

        // Further exploration based on the first decision
        if (decision1.equals("yes")) {
            System.out.println("The cryptic puzzle leads you to the Forgotten Library.");
            System.out.println("Will you delve into the ancient texts or decipher the magical scripts? (texts or scripts)");
            decision1a = scanner.nextLine();
            playerDecisions.add(decision1a);
        } else {
            System.out.println("Your path leads you to the Whispering Woods.");
            System.out.println("Would you like to navigate through the mystical foliage or study the enchanting wildlife? (navigate or study)");
            decision1b = scanner.nextLine();
            playerDecisions.add(decision1b);
        }

        // Second decision point
        System.out.println("As you proceed, you arrive at the Chamber of Prosperity.");
        System.out.println("Will you engage in negotiations with the enchanting merchants? (yes or no)");
        String decision2 = scanner.nextLine();
        playerDecisions.add(decision2);

        // Further exploration based on the second decision
        if (decision2.equals("yes")) {
            System.out.println("You enter the Tower of Trade.");
            System.out.println("Will you focus on alchemical trades or mystical artifacts? (trades or artifacts)");
            decision2a = scanner.nextLine();
            playerDecisions.add(decision2a);
        } else {
            System.out.println("Your path leads you to the Bazaar of Wonders.");
            System.out.println("Do you wish to explore enchanted relics or trade mystical ingredients? (relics or ingredients)");
            decision2b = scanner.nextLine();
            playerDecisions.add(decision2b);
        }

        // Third decision point
        System.out.println("Continuing your journey, you reach the Fountain of Healing.");
        System.out.println("Would you like to tend to the wounded mystical creatures? (yes or no)");
        String decision3 = scanner.nextLine();
        playerDecisions.add(decision3);

        // Further exploration based on the third decision
        if (decision3.equals("yes")) {
            System.out.println("You are guided to the Temple of Restoration.");
            System.out.println("Will you specialize in treating magical ailments or rehabilitating enchanted beings? (ailments or rehabilitation)");
            decision3a = scanner.nextLine();
            playerDecisions.add(decision3a);
        } else {
            System.out.println("Your path leads you to the Sanctuary of Serenity.");
            System.out.println("Do you wish to study the mystical energies or commune with the spirits? (energies or spirits)");
            decision3b = scanner.nextLine();
            playerDecisions.add(decision3b);
        }

     // Compare player decisions to specific fields
        System.out.println("\nAnalyzing your decisions and predicting potential career fields...");

        // Arbitrary data comparison (simulated)
        if (playerDecisions.contains("yes")) {
            System.out.println("Based on your adventurous spirit and decision-making, potential career fields include: ");
            if (decision1.equals("yes") && decision1a.equals("texts")) {
                ComputerScience cs = new ComputerScience();
                cs.displayFields();
            }
            if (decision1.equals("no") && decision1b.equals("navigate")) {
                EnvironmentalScience es = new EnvironmentalScience();
                es.displayFields();
            }
            if (decision2.equals("yes") && decision2a.equals("trades")) {
                BusinessAnalysis ba = new BusinessAnalysis();
                ba.displayFields();
            }
            if (decision2.equals("no") && decision2b.equals("relics")) {
                Archaeology ar = new Archaeology();
                ar.displayFields();
            }
            if (decision3.equals("yes") && decision3a.equals("ailments")) {
                VeterinaryScience vs = new VeterinaryScience();
                vs.displayFields();
            }
            if (decision3.equals("no") && decision3b.equals("energies")) {
                Psychology ps = new Psychology();
                ps.displayFields();
            }
        } else {
            System.out.println("Your decisions suggest a need for more exploration. Keep seeking your path in the Enchanted Realm!");
        }

        scanner.close();
    }
}
