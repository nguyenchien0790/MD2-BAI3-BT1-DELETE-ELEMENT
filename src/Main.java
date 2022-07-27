import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] ={10,4,6,7,8,6};
        System.out.println("Mảng sau ban đầu : " );
        for (int item:
                arr) {
            System.out.print(item+"\t");
        }

//        System.out.println("Nhập vào độ dài mảng: ");
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        for (int i =0; i< arr.length;i++){
//            System.out.println("Nhập vào phần tử thứ "+i+" của mảng");
//            arr[i]= input.nextInt();
//        }
//        System.out.println("Mảng sau khi nhập");
//        for (int item:
//                arr) {
//            System.out.print(item+"\t");
//        }
        System.out.println("\n Nhập số muốn xóa");
        int num = input.nextInt();
        int newsize = sizeArray(arr, num);
        int cnt =0;
        int[] newArray = new int[arr.length - newsize];

        for (int i = 0; i < arr.length; i++) {
            if(cnt<= newArray.length){
                if (arr[i]!=num){
                    newArray[cnt]=arr[i];
                    cnt++;
                }else {
                    continue;
                }
            }

        }
        System.out.println("Mảng sau khi xóa");
        for (int item:
                newArray) {
            System.out.print(item+"\t");
        }

    }
    public static int sizeArray ( int[] array, int num){
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                size++;
            }
        }
        return size;
    }
}











//        System.out.println( "max ---- "+ max(123,456));
//        max(123,567);
//    }
//    public static int max(int number1, int number2) {
//        int result = 0;
//        if (number1 > number2) {
//            result = number1;
//        } else {
//            result = number2;
//        }
//        System.out.println("max =====" + result);
//        return result;

//    }
//}