public class VariableLength {
    public static double averageOfSeries(int... numbers) {
        int length = numbers.length;
        int sum = 0;
        double average = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = (double) sum / length;
        String averageToString = String.format("%.1f", average);
        double averageToDouble = Double.parseDouble(averageToString);
        return averageToDouble;
    }

}
