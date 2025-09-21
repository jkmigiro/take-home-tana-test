public class Question3_ClosestMinimums {
    public static int findClosestMinimumsDistance(int[] arr) {
        // Find the minimum value
        int minValue = arr[0];
        for (int num : arr) {
            minValue = Math.min(minValue, num);
        }

        //Closest distance
        int minDistance = Integer.MAX_VALUE;
        int lastMinIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minValue) {
                if (lastMinIndex != -1) {
                    minDistance = Math.min(minDistance, i - lastMinIndex);
                }
                lastMinIndex = i;
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2 };
        var result = Question3_ClosestMinimums.findClosestMinimumsDistance(arr);
        System.out.println("Closest minimums distance: " + result);
    }
}
