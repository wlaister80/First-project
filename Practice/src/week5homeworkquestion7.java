public class week5homeworkquestion7 {
    public static void main(String[] args){
        int[] array = {5, 10, 15, 20, 25};

        double average = calculateAverage(array);
        System.out.println("Average of array: " + average);
    }
    public static double calculateAverage(int[] array){
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return (double) sum / array.length;
    }
}