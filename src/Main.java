public class Main {
    public static void main(String[] args) {

        // 1] Java code to find Smallest and Largest Element in an Array

        int[] arr = {32,46,1,32,45,23,45,121,34,277,4,8};

        int largestNum =arr[0];
        int smallestNum=arr[0];

      for(int i=0;i<arr.length-1;i++){
          if (arr[i]>largestNum){
              largestNum = arr[i];

          } if (arr[i]<smallestNum){
              smallestNum = arr[i];
          }

      }System.out.println("largest Number is - " + largestNum);
        System.out.println("smallest value is - " + smallestNum);



    }
}