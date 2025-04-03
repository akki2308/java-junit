package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp(){
        listManager = new ListManager();
        list = new ArrayList<>();
    }
    @Test
    public void shouldAddElementToTheList(){
//        ListManager listManager = new ListManager();
//        List<Integer> list = new ArrayList<>();
        listManager.addElement(list,5);
        listManager.addElement(list,7);
        listManager.addElement(list,9);
        listManager.addElement(list,3);


        Assertions.assertEquals(4, list.size());
//        Assertions.assertTrue(list.contains(5));
//        Assertions.assertTrue(list.contains(7));
//        Assertions.assertTrue(list.contains(9));
//        Assertions.assertTrue(list.contains(3));
        for (int data:list) {
            Assertions.assertTrue(list.contains(data));
        }

    }

    @Test
    public void shouldRemoveElementFromTheList(){
        listManager.addElement(list,7);
        boolean a = listManager.removeElement(list,7);
        Assertions.assertEquals(true,a);
    }

    @Test
    public void shouldGiveTheSizeOFTheList(){
        listManager.addElement(list,5);
        listManager.addElement(list,9);
        listManager.addElement(list,3);
        int size=listManager.calculateSize(list);
        Assertions.assertEquals(3, size);
    }
}
