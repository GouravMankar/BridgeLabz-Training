import java.util.Random;

public class OTPGenerator {

    // method to generate 6-digit OTP
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    // method to check uniqueness
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        System.out.println("All OTPs Unique? " + areUnique(otps));
    }
}
