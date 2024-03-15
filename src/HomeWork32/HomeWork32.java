package HomeWork32;

public class HomeWork32 {
    public static String rgb(int r, int g, int b) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
            throw new IllegalArgumentException("Invalid values for RGB");
        }
        String hexR = Integer.toHexString(r);
        String hexG = Integer.toHexString(g);
        String hexB = Integer.toHexString(b);

        hexR = addLeadingZero(hexR);
        hexG = addLeadingZero(hexG);
        hexB = addLeadingZero(hexB);





        return "#" + hexR + hexG + hexB;
    }

    public static String addLeadingZero(String hex) {
        return hex.length() < 2 ? "0" + hex : hex;
    }

    public static void main(String[] args) {
        System.out.println(rgb(0,0,255));
        System.out.println(rgb(0,255,0));
        System.out.println(rgb(255,0,0));
        System.out.println(rgb(0,0,0));
        System.out.println(rgb(0,0,245));

    }
}
