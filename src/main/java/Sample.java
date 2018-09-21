public class Sample {

    //int array[] = new int [] {1,3,4,5,23,43,111,234,256,1000};
    //int array[] = new int [] {1,2,3,4,5,6,7,8,9,10};
    int array[] = new int [] {1,2,3,4,5,6,7};

    int startingPosition = 0;
    int lastPosition = array.length-1;
    int midPosition = array.length/2;

    public static void main(String[] args){

        int noToFind =3;
        Sample sample = new Sample();

        sample.findElement(sample,23,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,5,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,1,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,11,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,1000,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,235,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,110,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,256,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,234,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,-123,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,43,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,3,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,4,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,111,sample.midPosition,sample.startingPosition);
        sample.findElement(sample,6,sample.midPosition,sample.startingPosition);
    }


    public void findElement(Sample sample,int noToFind,int midPosition,int tempStartPostion){

        if (noToFind<sample.array[sample.startingPosition]
                || noToFind > sample.array[sample.lastPosition] ){
            System.out.println("No Such element present in the array");
            return;
        }

        while(true){
            if (noToFind>sample.array[midPosition]) {
                tempStartPostion = midPosition;
                midPosition = midPosition+(midPosition/2);

                if (midPosition== sample.array.length){
                    midPosition--;
                } else if (midPosition>sample.array.length) {
                    midPosition = tempStartPostion+(midPosition-tempStartPostion/2);
                }

                if(noToFind<sample.array[midPosition] && noToFind>sample.array[tempStartPostion]){
                    if (noToFind==sample.array[tempStartPostion+1]) {
                        System.out.println(noToFind+"Element found at "+(tempStartPostion+1));
                        break;
                    }else{
                        System.out.println(noToFind+"Element not found.");
                        break;
                    }
                }
            } else if (noToFind<sample.array[midPosition]){
                tempStartPostion = midPosition;
                midPosition = (midPosition/2)>=1?(midPosition - (midPosition/2)):--midPosition;
                if (noToFind<sample.array[tempStartPostion] && noToFind>sample.array[midPosition]) {
                    if (noToFind==sample.array[++midPosition]) {
                        System.out.println(noToFind+"Element found at "+midPosition);
                        break;
                    }else{
                        System.out.println(noToFind+"Element not found.");
                        break;
                    }
                }
            } else if (noToFind==sample.array[midPosition]) {
                System.out.println(noToFind+"Element found at index"+midPosition);
                break;
            } else {
                System.out.println(noToFind+"No Such element present in the array.");
                break;
            }
        }
    }
}
