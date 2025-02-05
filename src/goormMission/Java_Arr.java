package goormMission;

public class Java_Arr {
    public static void main(String[] args){
        int[] arr = new int[]{5,3,4,1,2};

        System.out.print("정렬 전: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("오름차순 선택 정렬 후: ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){ // j: 비교하는 숫자, i번쨰의 오른쪽
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        //오름차순(ASC)
        System.out.print("오름차순 버블 정렬 후: ");
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
}
