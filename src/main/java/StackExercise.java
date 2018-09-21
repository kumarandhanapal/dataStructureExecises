public class StackExercise {

    //1) PUSH
    //2) POP



    static int stackCounter = -1;

    public static void pop(int [] stack){

        if (stackCounter==-1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Poped element from stack is "+ stack[stackCounter]);
            stack[stackCounter] = 0;
            --stackCounter;
        }
    }

    public static void push(int a,int [] stack) {

        if (stackCounter == stack.length-1) {
            System.out.println("Stack is overflow.");
        } else {
            stack[++stackCounter] = a;
            System.out.println("Element has been pushed successfully.");
        }
    }

    public static void main(String[] args){

        int [] stack = new int[10];

        push(1,stack);
        push(1,stack);
        push(1,stack);
        push(1,stack);
        push(1,stack);
        push(1,stack);
        push(1,stack);
        push(1,stack);
        push(1,stack);
        push(1,stack);
        push(1,stack);

        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);
        pop(stack);





    }
}
