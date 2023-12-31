public class week5homeworkquestion8 {
    public static void main(String args[]){
        int[] myArray = {12, 45, 64, 38, 86, 5};
        int num = 12;

        for(int i = 0; i<myArray.length; i++){
            if(num == myArray[i]){
                System.out.println("Array contains given element");
            }
        }
    }
}