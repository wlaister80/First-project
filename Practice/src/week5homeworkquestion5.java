public class week5homeworkquestion5 {
    public static void main(String...a){
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6 - i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}