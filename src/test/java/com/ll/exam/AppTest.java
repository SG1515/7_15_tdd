package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();

    }
    @Test
    void size() {
        ArrayList al = new ArrayList();
        assertEquals(0, al.size());
    }

    @Test
    void add() {
        ArrayList al = new ArrayList();
        al.add(100);
    }

    @Test
    void get() {
        ArrayList al = new ArrayList();
        al.add(100);
        int rs = al.get(0);

        assertEquals(100, rs);
    }
    @Test
    void add_한번_할_때_마다_사이즈_증가() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertEquals(3, al.size());
    }
    @Test
    void get_1_equals_200() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        int rs = al.get(1);

        assertEquals(200, rs);
    }

    @Test
    void removeAt() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        al.removeAt(1);
    }
    @Test
    void removeAt을_실행하면_size가_줄어든다() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertEquals(3, al.size());
        al.removeAt(1);
        assertEquals(2, al.size());
    }
}
