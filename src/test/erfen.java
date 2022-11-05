package test;

public class erfen {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] sortedArray = new int[]{1,1,2,2,2,3,4,4,4,5,5,5,5,5,6,7,7,8,9,10,10,10,11,11,12,13,14,14,14,14,15};
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("index:"+i+";number:"+sortedArray[i]);
        }
        System.out.println(sortedArray.length);
        int baseIndex = sortedArray.length/2;
        int leftNumber = 4;
        System.out.println(baseIndex);
        int minIndex = 0;
        int maxIndex = sortedArray.length - 1;
//        ef(sortedArray, minIndex, maxIndex, 0);
        ef(sortedArray, minIndex, maxIndex, 1);
        ef(sortedArray, minIndex, maxIndex, 2);
        ef(sortedArray, minIndex, maxIndex, 3);
        ef(sortedArray, minIndex, maxIndex, 4);
        ef(sortedArray, minIndex, maxIndex, 5);
        ef(sortedArray, minIndex, maxIndex, 6);
        ef(sortedArray, minIndex, maxIndex, 7);
        ef(sortedArray, minIndex, maxIndex, 8);
        ef(sortedArray, minIndex, maxIndex, 9);
        ef(sortedArray, minIndex, maxIndex, 10);
        ef(sortedArray, minIndex, maxIndex, 11);
        ef(sortedArray, minIndex, maxIndex, 12);
        ef(sortedArray, minIndex, maxIndex, 13);
        ef(sortedArray, minIndex, maxIndex, 14);
        ef(sortedArray, minIndex, maxIndex, 15);
//        ef(sortedArray, minIndex, maxIndex, 16);
//        ef(sortedArray, minIndex, maxIndex, 17);
//        ef(sortedArray, minIndex, maxIndex, 18);
    }

    public static void ef(int[] sortedArray, int minIndex, int maxIndex, int leftNumber) {
        if (minIndex == maxIndex) {
            System.out.println("【1】leftNumber index is:" + minIndex);
            return;
        }
        int middleIndex = (minIndex + maxIndex)/2;
        if (sortedArray[middleIndex] > leftNumber) {
            ef(sortedArray, minIndex, middleIndex - 1, leftNumber);
;        } else if (sortedArray[middleIndex] < leftNumber) {
            ef(sortedArray, middleIndex + 1, maxIndex, leftNumber);
        } else {
            if (sortedArray[middleIndex] == sortedArray[middleIndex - 1]) {
                ef(sortedArray, minIndex, middleIndex -1, leftNumber);
            } else if (sortedArray[middleIndex] > sortedArray[middleIndex - 1]) {
                System.out.println("【3】leftNumber index is:" + middleIndex);
            }
        }
    }

    public static void randomArray(int number) {
        int[] arrayRandom = new int[101];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int)(Math.random()*101);
        }
    }

}
