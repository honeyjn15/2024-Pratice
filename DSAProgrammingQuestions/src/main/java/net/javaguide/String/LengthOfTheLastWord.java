package net.javaguide.String;

//leet code -> 58
public class LengthOfTheLastWord {

    public static void main(String args[]) {

        String s = "   fly me   to   the moon  ";
        int count = findLength(s);
        System.out.println(count);
    }

    private static int findLength(String s) {

        char[] c = s.toCharArray();
        int count = 0;
        for (int i = c.length - 1; i >= 0; i--) {

            if (c[i] == ' ' && count ==0) {
                continue;
            } else if (c[i] != ' ') {
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }
}
