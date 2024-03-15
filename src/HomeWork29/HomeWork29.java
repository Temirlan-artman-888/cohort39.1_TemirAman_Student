package HomeWork29;

import java.util.HashSet;
import java.util.Set;

public class HomeWork29 {
    public static void main(String[] args) {
        Set<String> oldListSet = new HashSet<>();

        oldListSet.add("one");
        oldListSet.add("two");
        oldListSet.add("three");
        oldListSet.add("four");

        Set<String> newListSet = new HashSet<>();

        newListSet.add("five");
        newListSet.add("Six");
        newListSet.add("three");
        newListSet.add("eight");

        combineTwoSets(newListSet, oldListSet);


    }

    public static Set<String> combineTwoSets(Set<String> setList1, Set<String> setList2) {
        Set<String> intersectionList = new HashSet<>();

        for (String elementSet : setList1) {
            if (setList2.contains(elementSet)) {
                intersectionList.add(elementSet);
            }

        }
        System.out.println("intersectionList = " + intersectionList);

        return intersectionList;
    }

}
