package net.javaguide;

import java.util.Scanner;

public class CharacterPrinting {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the chararcter");
        String input = sc.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            char character = input.charAt(i);
            int repeatCharacter = Character.getNumericValue(input.charAt(i+1));
            for (int j = 0; j < repeatCharacter; j++) {
                output.append(character);
            }
        }
        System.out.println(output.toString());
    }
}
