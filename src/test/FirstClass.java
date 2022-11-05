package test;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello,World.");
        int[] toSortedList = {5,3,9,4,6,7,3,4,5};
        //334455679
        //334455679
        //334455070
        selectSort(toSortedList);
        for (int i = 0; i < toSortedList.length; i++) {
            System.out.print(toSortedList[i]);
        }
        System.out.println("testMethod");
        testMethod();
    }

    public static void insertSort(int[] toSortedList) {
        //[5,3,9,4,6,7,3,4,5]
        //第一个for循环是为了从index=1开始逐个往前比较
        //[1] compare [0]
        //[2] compare [1],[1] compare [0]
        // ....
        for (int i = 1; i < toSortedList.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (toSortedList[j] > toSortedList[j+1]) {
                    swap(toSortedList, j+1, j);
                }
            }
        }
    }

    public static void swap(int[] toSortedList, int i, int j) {
        toSortedList[i] = toSortedList[i] ^ toSortedList[j];
        toSortedList[j] = toSortedList[i] ^ toSortedList[j];
        toSortedList[i] = toSortedList[i] ^ toSortedList[j];
    }


    public static void selectSort(int[] toSortedList) {
        for (int i = 0; i < toSortedList.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < toSortedList.length; j++) {
                if (toSortedList[min] > toSortedList[j]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(toSortedList, i, min);
            }
        }
    }

    public static void testMethod(){
        Integer [] numList = {1,2,2,2,1,4,5,2,5,3,9,6};
        for(int i=0;i<numList.length-1;i++){
            int max = numList[i];
            for(int j = i+1;j<numList.length;j++){
                if(numList[i]<numList[j]){
                    max = numList[j];
                    numList[j]=numList[i];
                    numList[i]=max;
                }
            }
        }
        for(int num:numList){
            System.out.print(numList[num]+" ");
        }
    }


}
