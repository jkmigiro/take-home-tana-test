import java.util.Arrays;
import java.util.List;

class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class TestCases {
    static void testLongestString() {
        // Test longest string
        var validCharacters = List.of('A', 'B', 'C', 'D');
        var strings = new String[] {
                "AABCDA",
                "ABCDZADC",
                "ABCDBCA",
                "ABCDABDCA",
        };
        var result = Question1_LongestString.getLongestString(
                validCharacters,
                strings);
        if (result == null || !result.equals("ABCDABDCA")) {
            throw new InvalidDataException("Expected ABCDABDCA instead got " + result);
        }
        System.out.println("Longest string is: " + result);
    }

    static void testFirstUniqueProduct() {
        String[] products1 = { "Apple", "Computer", "Apple", "Bag" };
        var result = Question2_firstUniqueProduct.firstUniqueProduct(products1);
        if (result == null || !result.equals("Computer")) {
            throw new InvalidDataException("Expected Computer instead got " + result);
        }
        System.out.println("First unique product is: " + result);
    }

    static void testClosestMinimums() {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2 };
        var result = Question3_ClosestMinimums.findClosestMinimumsDistance(arr);
        if (result != 3) {
            throw new InvalidDataException("Expected 3 instead got " + result);
        }

    }

    static void testThreeMostCommon() {

        String input1 = "hi there care to discuss algorithm basis or how to solve algorithm or";
        var result = Question4_ThreeMostCommon.getThreeCommonStrings(input1);
        String[] expected = { "algorithm", "or", "to" };
        if (!Arrays.equals(expected, result)) {
            System.out.println("Result: "+Arrays.toString(result)+" expected: "+Arrays.toString(expected));
            throw new InvalidDataException("Expected [\"algorithm\", \"or\",\"to \"] instead got " + result);
        }
        System.out.println(
                "Three most common: " +
                        Arrays.toString(
                                result));
    }

    static void testListRotation() {
        Node head = new Node("ID_A01");
        head.next = new Node("ID_A02");
        head.next.next = new Node("ID_A03");
        head.next.next.next = new Node("ID_A04");
        head.next.next.next.next = new Node("ID_A05");
        head.next.next.next.next.next = new Node("ID_A06");
        var result = Question5_RotateRight.rotateToTheRight(head, 2);
        StringBuilder sb = new StringBuilder();
        Node current = result;
        while (current != null) {
            sb.append("\"");
            sb.append(current.item);
            sb.append("\"");
            if (current.next != null) {
                sb.append("->");
            }
            current = current.next;
        }
        sb.append("->null");
              if (!sb.toString().equals("\"ID_A05\"->\"ID_A06\"->\"ID_A01\"->\"ID_A02\"->\"ID_A03\"->\"ID_A04\"->null")) {
            throw new InvalidDataException("Expected \"ID_A05\"->\"ID_A06\"->\"ID_A01\"->\"ID_A02\"->\"ID_A03\"->\"ID_A04\"->null instead got " + result);
        }
        System.out.println("Rotated list: "+sb.toString());

    }

}
