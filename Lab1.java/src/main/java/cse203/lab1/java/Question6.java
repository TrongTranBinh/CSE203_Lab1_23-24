package cse203.lab1.java;

public class Question6 {

    private String s1;

    public Question6(String s1) {
        this.s1 = s1;
    }

    public Question6() {
    }

    public String getS1() {
        return s1;
    }

    public void getSizeOfString() {
        System.out.println(s1.length());
    }

    public void countWords() {
        if (s1.isEmpty()) {
            System.out.print(0);
        } else {
            int countWords = s1.split("\\s").length;
            System.out.println(countWords);
        }
    }

    public void concatenate(Question6 s2) {
        System.out.println(s1.concat(" " + s2.getS1()));
    }

    public void isPalindrome() {
        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev += s1.charAt(i);
        }
        System.out.print((s1.equals(rev)) ? "Yes" : "No");
    }
}
