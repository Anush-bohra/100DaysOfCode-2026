import java.util.*;

public class Main {

    public static int firstInvalidRecord(String[][] deliveries) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < deliveries.length; i++) {
            String vendorId = deliveries[i][0];
            String lotNumber = deliveries[i][1];
            String certCode = deliveries[i][2];

            String key = vendorId + "#" + lotNumber;

            if (map.containsKey(key)) {
                if (!map.get(key).equals(certCode)) {
                    return i;   // First invalid record
                }
            } else {
                map.put(key, certCode);
            }
        }

        return -1; // All records are valid
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[][] deliveries = new String[n][3];

        for (int i = 0; i < n; i++) {
            deliveries[i][0] = sc.next();
            deliveries[i][1] = sc.next();
            deliveries[i][2] = sc.next();
        }

        System.out.println(firstInvalidRecord(deliveries));
    }
}