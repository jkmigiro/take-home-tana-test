public class Question3_ClosestMinimums {
     public static int findClosestMinimumsDistance(int[] arr) {
         int minValue = arr[0];
        for (int num : arr) {
            minValue = Math.min(minValue, num);
        }
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
}
