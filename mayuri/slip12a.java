import java.util.*;

class CountRecordsWithoutDB {
    public static void main(String[] args) {

        // Hardcoded data - simulate database table
        List<String[]> sales = new ArrayList<>();

        // Each record: PID, PName, Qty, Rate, Amount
        sales.add(new String[]{"101", "Pen", "10", "10", "100"});
        sales.add(new String[]{"102", "Notebook", "5", "20", "100"});
        sales.add(new String[]{"103", "Pencil", "8", "8", "64"});

        // Count records
        int count = sales.size();

        // Output
        System.out.println("Total records (without DB): " + count);
    }
}