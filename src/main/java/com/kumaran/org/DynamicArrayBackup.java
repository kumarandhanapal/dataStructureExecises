package com.kumaran.org;

public class DynamicArrayBackup<String> {

    private int capacity;
    private Object[] dataArray= null;
    private int currentIndex = 0;

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

    public DynamicArrayBackup(int capacity) {
        this.capacity = capacity;
        this.dataArray = new Object[capacity];
    }

    public String get(int index) {
        return (String)this.dataArray[index];
    }

    public void set(int index,String value){
        this.dataArray[index] = value;
        this.currentIndex++;
    }

    public void insert(int index, String value) {

        Object[] newdataArray = null;
        if (dataArray[dataArray.length - 1] != null) {
            newdataArray = new Object[dataArray.length * 2];
            System.arraycopy(dataArray, 0, newdataArray, 0, currentIndex);
            this.dataArray = newdataArray;
        } else {
            newdataArray = new Object[this.getCapacity()];
        }
        if (index > -1 && index == 0) {
            newdataArray[index] = value;
            //System.arraycopy(dataArray, 0, newdataArray, index + 1, dataArray.length);
            System.arraycopy(dataArray, 0, dataArray, index + 1, currentIndex);
            currentIndex++;
        } else if (index > 0) {
            /*System.arraycopy(dataArray, 0, newdataArray, 0, index);
            newdataArray[index] = value;
            System.arraycopy(dataArray, index, newdataArray, index + 1, currentIndex - (index));
            this.dataArray = newdataArray;
            currentIndex++;*/

            //System.arraycopy(dataArray, 0, newdataArray, 0, index);
            //newdataArray[index] = value;
            System.arraycopy(dataArray, index, dataArray, index + 1, currentIndex - (index));
            newdataArray[index] = value;
            //this.dataArray = newdataArray;
            currentIndex++;
        }

    }

    public void delete(int index) {

    }

}
