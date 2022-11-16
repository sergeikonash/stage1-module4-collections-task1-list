package com.epam.mjc.collections.list;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if ((i+1) % 3 == 0) {
                list.add(sourceList.get(i));
                list.add(sourceList.get(i));
            }
        }
        return list;
    }
}
