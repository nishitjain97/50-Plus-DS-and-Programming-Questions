import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CheckDuplicates {
    public static void main(String[] args) {
        String[] withDuplicates = new String[] {"one", "two", "three", "one"};
        String[] withoutDuplicates = new String[] {"one", "two", "three"};

        System.out.println("Checking array with duplicate using brute force: " + bruteforce(withDuplicates));
        System.out.println("Checking array without duplicates using brute force: " + bruteforce(withoutDuplicates));

        System.out.println("Checking array with duplicates using Set and List: " + checkDuplicatesUsingSet(withDuplicates));
        System.out.println("Checking array without duplicates using Set and List: " + checkDuplicatesUsingSet(withoutDuplicates));

        System.out.println("Checking array with duplicates using HashSet: " + checkDuplicatesUsingAdd(withDuplicates));
        System.out.println("Checking array without duplicates using HashSet: " + checkDuplicatesUsingAdd(withoutDuplicates));
    }

    @SuppressWarnings("unchecked")
    public static boolean bruteforce(String[] input) {
        for(int i = 0; i < input.length; i++) {
            for(int  j = 0; j < input.length; j++) {
                if(input[i].equals(input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    public static boolean checkDuplicatesUsingSet(String[] input) {
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);

        if(inputSet.size() < inputList.size()) {
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public static boolean checkDuplicatesUsingAdd(String[] input) {
        Set tempSet = new HashSet();

        for(String str: input) {
            if(!tempSet.add(str)) {
                return true;
            }
        }
        return false;
    }
}
