import java.util.*;

public class Question4_ThreeMostCommon {

    public static String[] getThreeCommonStrings(String string) {
        var stringArr = string.trim().toLowerCase().split("\\s+");

        var stringMap = new HashMap<String, Integer>();

        for (String string2 : stringArr) {
            stringMap.put(string2, stringMap.getOrDefault(string2, 0) + 1);
        }
        return sortMapByValue(stringMap).toArray(new String[0]);
    }

    static List<String> sortMapByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        // Sort using custom comparator in ascending order
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // Get top three most common strings
        List<String> top = new ArrayList<>();
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            top.add(list.get(i).getKey());
        }

        Collections.sort(top);
        return top;
    }

    public static void main(String[] args) {
        String input1 = "hi there care to discuss algorithm basis or how to solve algorithm or";
        var result = Question4_ThreeMostCommon.getThreeCommonStrings(input1);
        System.out.println(
                "Three most common: " +
                        Arrays.toString(
                                result));
    }
}
