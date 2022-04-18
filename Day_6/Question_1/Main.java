package Question_1;

public class Main {
    public static void main(String[] args) {
        Context conAdd = new Context(new AddingNumbers());
        int addition = conAdd.getStrategy(5,6);
        System.out.println(addition);


        Context conSubstract = new Context(new SubtractingNums());

        int subs = conSubstract.getStrategy(19,9);
        System.out.println(subs);
    }
}
