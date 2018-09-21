package com.kumaran.org;

public class Test123 {

    public static void main(String[] args) {

        DynamicArray<String> da = new DynamicArray<>(4);
        da.set(0,"A");
        da.set(1,"C");
        da.set(2,"D");
        da.set(3,"E");

        printArray(da);
        da.insert(1,"B");
        printArray(da);
        da.insert(1,"X");
        printArray(da);
        da.insert(7,"Y");
        printArray(da);
        da.insert(12,"Z");
        printArray(da);
        da.insert(5,"J");
        printArray(da);


    }

    public static void printArray(DynamicArray<String> da) {
        for (Object obj :da.getDataArray()) {
            System.out.print((String) obj);
            System.out.print(" ");
        }
        System.out.println("======================================================================================");
    }
}
