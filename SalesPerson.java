public class SalesPerson {

    private String id;
    private Sales[] salesHistory;
    private int count = 0;

    public SalesPerson(String id) {
        this.id = id;
        salesHistory = new Sales[100];
    }

    public SalesPerson(String id, Sales[] s, int c) {
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }

    public int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count++;
    }

    public Sales getSalesHistory(int i) {
        return salesHistory[i];
    }

    public double calcTotalSales() {
        double totalSales = 0.0;
        for (int i = 0; i < count; i++) {
            totalSales += salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return totalSales;
    }

    public Sales largestSale() {
        Sales largest = null;
        for (int i = 0; i < count; i++) {
            if (largest == null || salesHistory[i].getValue() * salesHistory[i].getQuantity() > largest.getValue() * largest.getQuantity()) {
                largest = salesHistory[i];
            }
        }
        return largest;
    }
}