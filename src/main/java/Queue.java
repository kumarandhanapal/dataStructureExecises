import java.util.Arrays;

public class Queue {



    static int  insertPointer = -1;
    static int  servePointer = -1;


    public static void main(String[] args) {
         int[] queueArray = new int[10];
        for (int i = 0; i< 11;i++) {
            push(i+1,queueArray);
        }

        System.out.println(Arrays.toString(queueArray));

        for (int i = 0; i< 12;i++) {
            popOrServe(queueArray);
        }



    }


    public static void push(int a,int[] queueArray){



        if(insertPointer==-1 && servePointer==queueArray.length-1){
            System.out.println("Queue is full");
            return;
        }
        ++insertPointer;

        if (insertPointer == queueArray.length && (servePointer == -1)) {
            System.out.println("Queue is full.");
        } else {
            if(insertPointer == queueArray.length && servePointer>0){
                insertPointer = 0;
                queueArray[insertPointer] = a;
            } else if (insertPointer == queueArray.length-1) {
                queueArray[insertPointer] = a;
                insertPointer = -1;
            } else {
                queueArray[insertPointer] = a;
            }

        }
    }

    public static void popOrServe(int[] queueArray){

        ++servePointer;
        if (insertPointer==-1) {
            System.out.println("Queue is empty");
        } else{

            if(servePointer==0) {}
            if (servePointer!=queueArray.length && servePointer==insertPointer) {
                insertPointer = -1;
                System.out.println("Popped element is "+ queueArray[servePointer]);
                servePointer = -1;
            } else if ((servePointer == queueArray.length-1) && (insertPointer > -1 && insertPointer< queueArray.length-1)) {
                servePointer = -1;
                System.out.println("Popped element is " + queueArray[servePointer]);
            }else if (servePointer!=queueArray.length){
                System.out.println("Popped element is "+ queueArray[servePointer]);
            }else if (servePointer==queueArray.length){
                System.out.println("Unable to pop");
                servePointer = -1;
            }
        }
    }

}
