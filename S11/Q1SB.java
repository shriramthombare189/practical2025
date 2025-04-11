import java.util.*;
import java.text.*;

class Sale {
    int pid;
    String pname;
    int qty;
    double rate;
    double amount;
    Date saleDate;

    Sale(int pid, String pname, int qty, double rate, String dateStr) throws ParseException {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
        this.rate = rate;
        this.amount = qty * rate;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.saleDate = sdf.parse(dateStr);
    }
}
class SalesReport {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Sample data
        List<Sale> sales = new ArrayList<>();
        sales.add(new Sale(101, "Pen", 10, 10.0, "2024-01-05"));
        sales.add(new Sale(102, "Notebook", 5, 20.0, "2024-02-10"));
        sales.add(new Sale(103, "Eraser", 15, 5.0, "2024-03-20"));
        sales.add(new Sale(104, "Pencil", 8, 8.0, "2024-04-15"));

        // Input dates
        System.out.print("Enter From Date (yyyy-MM-dd): ");
        Date fromDate = sdf.parse(sc.nextLine());

        System.out.print("Enter To Date (yyyy-MM-dd): ");
        Date toDate = sdf.parse(sc.nextLine());

        // Display
        System.out.println("\nSales Report Between Dates:");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-5s %-12s %-5s %-7s %-8s %-12s\n", "PID", "PName", "Qty", "Rate", "Amount", "Date");
        System.out.println("-------------------------------------------------------");

        for (Sale s : sales) {
            if (!s.saleDate.before(fromDate) && !s.saleDate.after(toDate)) {
                System.out.printf("%-5d %-12s %-5d %-7.2f %-8.2f %-12s\n",
                        s.pid, s.pname, s.qty, s.rate, s.amount, sdf.format(s.saleDate));
            }
        }

        sc.close();
    }
}
