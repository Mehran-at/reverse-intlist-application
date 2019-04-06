package revrsenumberlist;

import java.util.ArrayList;
import java.util.List;

public class How implements What{
    @Override
    public List<Integer> getSeveralNumber(List<Integer> originalList) {
        List<Integer> reversedList = new ArrayList<>();
        if (originalList.size()==0) {
            return new ArrayList<>();
        }
        for (int i = 1; i <= originalList.size();i++) {
            Integer integer = originalList.get(originalList.size() - i);
            reversedList.add(integer);
        }
        return reversedList;
    }
}
