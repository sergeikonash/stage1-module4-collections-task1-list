package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer integer : sourceList) {
            if (integer % 2 != 0) {
                list.addFirst(integer);
            } else {
                list.addLast(integer);
            }
        }
        return list;
    }
}
