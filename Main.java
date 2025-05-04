public class Main{
    public static void main(String[] args){
        WordMatch w = new WordMatch("concatenation");
        System.out.println(w.scoreGuess("ten"));
        System.out.println(w.scoreGuess("nation"));
        System.out.println(w.findBetterGuess("ten", "nation"));
        System.out.println(w.scoreGuess("con"));
        System.out.println(w.scoreGuess("cat"));
        System.out.println(w.findBetterGuess("con", "cat"));
    }
}