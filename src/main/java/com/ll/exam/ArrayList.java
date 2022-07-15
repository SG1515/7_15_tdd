package com.ll.exam;

public class ArrayList {

    private int size;
    private int[] datum;

    public ArrayList() {
        size = 0;
        datum = new int[100];
    }

    public int size() {
        return size;
    }


    public void add(int data) {
        datum[size] = data; //size를 증가시키면서 데이터를 넣는다.
        size++;
    }

    public int get(int index) {
        return datum[index];
    }

    public void removeAt(int index) {
        for(int i = index+1; i< size; i++ ){
            datum[i-1] = datum[i];
        }

        --size;
    }
}
