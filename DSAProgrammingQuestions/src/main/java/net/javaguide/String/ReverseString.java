package net.javaguide.String;

public class ReverseString {

    public static void main(String[] args) {
        String s1 = "abc is the ";
        char[] ch = s1.toCharArray();
        for (int i = ch.length-1; i >=0 ; i--) {
            System.out.print(ch[i]);
        }
    }
}
