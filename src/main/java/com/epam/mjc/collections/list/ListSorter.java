package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int compare;
        int intA = Integer.parseInt(a);
        int funcA = 5 * intA * intA + 3;
        int intB = Integer.parseInt(b);
        int funcB = 5 * intB * intB + 3;
        if (funcA > funcB) compare = 1;
        else compare = -1;
        return compare;
    }
}
