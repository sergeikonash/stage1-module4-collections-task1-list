package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;
public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        for(int i = 0; i < sourceList.size(); i++) {
            for(int j = sourceList.size()-1; j > i; j--) {
                if ((listComparator.compare(sourceList.get(j), sourceList.get(j-1)) + "").equals(sourceList.get(j-1))) {
                    String n = sourceList.get(j-1);
                    sourceList.set(j-1, sourceList.get(j));
                    sourceList.set(j, n);
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        try {
            int aInt = Integer.parseInt(a);
            int bInt = Integer.parseInt(b);
            int fA = 5 * ((int) Math.pow(aInt, 2)) + 3;
            int fB = 5 * ((int) Math.pow(bInt, 2)) + 3;
            if (fA > fB) {
                return aInt;
            } else if (fB > fA) {
                return bInt;
            } else {
                return Math.max(aInt, bInt);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1000;
    }
}
