import java.util.Arrays;
import java.util.Scanner;

public class Deletearray {
    public static void main(String[] args) {

        // xóa phần tử theo giá trị trong mảng

        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};
        System.out.println("nhap so muon xoa: ");
        int[] array2 =new int[array.length-1];
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(num == array[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("khong xay ra");
        }
        else {
            System.out.println("phan tu " + num + " vi tri " + index);
            for (int i = 0; i < array2.length; i++) {
                if (i <index) {
                    array2[i] = array[i];
                }  if (i >= index) {
                    array2[i] = array[i+1];
                }
            }
        }
        System.out.println(Arrays.toString(array2));
    }


    // xóa phần tử theo vị trí index

    private static void extracted() {
        int[] arr ={1,2,3,4,5,6,7};
        int[] arr2 =new int[arr.length-1];
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        for (int i=0; i < index; i++){
            arr2[i] = arr[i];
        }
        for (int j = index; j < arr2.length; j++){
            arr2[j] = arr[j +1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
