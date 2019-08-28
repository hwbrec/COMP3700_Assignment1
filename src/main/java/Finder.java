public class Finder {
    public static Integer findMax(Integer[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        Integer max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    public static Integer findMin(Integer[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        Integer min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}