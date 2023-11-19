public class PixelQuantization {
    static int[] pixel = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};

    public static byte quantized(byte range) {
        for (byte value = 0; value < 21; value++) {
            if (value == range) {
                range = (byte) pixel[0];
            }
        }
        for (byte value = 21; value < 41; value++) {
            if (value == range) {
                range = (byte) pixel[1];
            }
        }
        for (byte value = 41; value < 61; value++) {
            if (value == range) {
                range = (byte) pixel[2];
            }
        }
        for (byte value = 61; value < 81; value++) {
            if (value == range) {
                range = (byte) pixel[3];
            }
        }
        for (byte value = 81; value < 101; value++) {
            if (value == range) {
                range = (byte) pixel[4];
            }
        }
        for (byte value = 101; value < 121; value++) {
            if (value == range) {
                range = (byte) pixel[5];
            }
        }
        return range;
    }

    public static int quantized(int range) {
        for (int value = 121; value < 141; value++) {
            if (value == range) {
                range = pixel[6];
            }
        }
        for (int value = 141; value < 161; value++) {
            if (value == range) {
                range = pixel[7];
            }
        }
        for (int value = 161; value < 181; value++) {
            if (value == range) {
                range = pixel[8];
            }
        }

        return range;
    }
}
