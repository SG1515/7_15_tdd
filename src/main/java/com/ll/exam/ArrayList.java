package com.ll.exam;

public class ArrayList {

    private int size;
    private int[] datum;

    public ArrayList() {
        size = 0;
        datum = new int[2];
    }

    public int size() {
        return size;
    }


    public void add(int data) {
        sizeUpIfFull();


        datum[size] = data; //size를 증가시키면서 데이터를 넣는다.
        size++;
    }

    private void sizeUpIfFull() {
        if( isFull() ){
            sizeUp();
        }
    }

    private void sizeUp() {
        int[] newDatum = new int[datum.length *2];

        for(int i=0; i<datum.length; i++){
            newDatum[i] = datum[i];

        }

        datum = newDatum;
    }

    private boolean isFull() {
        return size == datum.length;
    }

    public int get(int index) {
        return datum[index];
    }

    public void removeAt(int index) {
        for(int i = index+1; i< size; i++ ){
            datum[i-1] = datum[i]; // index+1값을 index로 옮긴다.
        }

        size--; //index자리에 있는 수를 없애주고 size를 줄여준다.
    }

    public int getArrayLength() {


        return datum.length;
    }
}
