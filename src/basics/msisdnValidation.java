package basics;

public class msisdnValidation {

    public boolean validate(String msisdn) {
        // 1. Check for null or blank (empty or spaces only)
        if (msisdn == null || msisdn.isBlank()) {
            return false;
        }

        // 2. Remove all whitespace
        msisdn = msisdn.replaceAll("\\s+", "");

        // 3. Remove country code prefix if present
        if (msisdn.startsWith("+91")) {
            msisdn = msisdn.substring(3);
        } else if (msisdn.startsWith("91") && msisdn.length() > 10) {
            msisdn = msisdn.substring(2);
        }

        // 4. Ensure it's not empty before checking characters
        if (msisdn.isEmpty()) {
            return false;
        }

        // 5. Must not start with 0 or 1
        if (msisdn.startsWith("0") || msisdn.startsWith("1")) {
            return false;
        }

        // 6. Must be exactly 10 digits
        return msisdn.matches("^\\d{10}$");
    }

    public static void main(String[] args) {
        msisdnValidation mv = new msisdnValidation();
        String msisdn = "+919876543210";
        System.out.println(mv.validate(msisdn)); // true
        System.out.println(mv.validate(" "));            // false (no crash!)
        System.out.println(mv.validate("11234"));        // false
        System.out.println(mv.validate(null));           // false
    }

}
