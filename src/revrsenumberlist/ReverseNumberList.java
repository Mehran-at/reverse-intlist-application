package revrsenumberlist;
//  Develop the following code:
//      Define the reverse action that receives a collection of numbers and returns the collection reversed.
//      Define a collection of numbers.
//      Write a code that reverses a collection of numbers, says the original collection and then says the reversed.
//          Available actions: getSeveralNumbers()
import java.util.Arrays;
import java.util.List;

public class ReverseNumberList {
    public static void main(String[] args) {
        How how = new How();
        List<Integer> originalList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,0);
        List<Integer> reversedList = how.getSeveralNumber(originalList);
        System.out.println("Reversed order of the list of " + originalList + " is " + reversedList + "\n");

        List<Integer> originalListOne = Arrays.asList();
        List<Integer> reversedListTwo = how.getSeveralNumber(originalListOne);
        System.out.println("Reversed order of the list of " + originalListOne + " is " + reversedListTwo);
    }
}
