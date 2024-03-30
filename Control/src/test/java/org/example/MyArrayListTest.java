package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MyArrayListTest {
    private MyArrayList list;
    @BeforeEach
    void setUp () {
        list = new MyArrayList();
    }
    @Test
    void add() {
        list.add(1);
        Assertions.assertEquals(1,list.array[0]);
    }
    @Test
    void addInd() {
        list.addInd(0,1);
        Assertions.assertEquals(1,list.array[0]);
    }
    @Test
    void clear() {
        list.add(1);
        list.add(2);
        list.clear();
        Assertions.assertNull(list.array);
    }
    @Test
    void remove() {
        list.add(1);
        list.add(2);
        list.remove(1);
        Assertions.assertEquals(1,list.array[0]);;
    }
    @Test
    void findByInd() {
        list.add(1);
        list.add(2);
        Assertions.assertEquals(1,list.findByInd(0));
    }

}
