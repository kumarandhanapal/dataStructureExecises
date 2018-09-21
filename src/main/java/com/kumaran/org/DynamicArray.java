package com.kumaran.org;

public class DynamicArray {

    private int capacity;
    private Object[] dataArray= null;
    private int lastUsedIndex = 0;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Object[] getDataArray() {
        return dataArray;
    }

    public void setDataArray(Object[] dataArray) {
        this.dataArray = dataArray;
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.dataArray = new Object[capacity];
    }

    public String get(int index) {
        return (String)this.dataArray[index];
    }

    public void set(int index,String value){
        this.dataArray[index] = value;
        //this.currentIndex++;
        if (index>this.lastUsedIndex) {
            this.lastUsedIndex = index;
        }
    }

    public void insert(int index, String value) {

        Object[] newdataArray = null;
        if (dataArray[dataArray.length - 1] != null || index>capacity) {
            newdataArray = new Object[dataArray.length * 2];
            capacity = dataArray.length * 2;
            System.arraycopy(dataArray, 0, newdataArray, 0, lastUsedIndex+1);
            this.dataArray = newdataArray;
        }

        if (index > -1 && index == 0) {
            System.arraycopy(dataArray, 0, dataArray, index + 1, lastUsedIndex+1);
            dataArray[index] = value;
            if (index>this.lastUsedIndex) {
                this.lastUsedIndex = index;
            }
        } else if (index > 0) {
            if (index>this.lastUsedIndex) {
                this.lastUsedIndex = index;
                dataArray[index] = value;
            } else {
                System.arraycopy(dataArray, index, dataArray, index + 1, (lastUsedIndex+1) - (index));
                dataArray[index] = value;
            }
        }
    }

    public void delete(int index) {

    }

}
