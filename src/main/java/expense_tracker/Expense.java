package expense_tracker;

/**
 * A container for a given expense.
 * Includes a category, cost, and date.
 * 
 * @author Fisher Lyon
 */
 public class Expense {

    private String category;
    private double amount; // total cost, including tax
    private String date; // Format : YYYY-MM-DD
    private String method; // method of payment

    public Expense(String category, double amount, String date, String method) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.method = method;
    }

    public String getCategory() { return this.category; }
    public double getAmount() { return this.amount; }
    public String getDate() { return this.date; }
    public String getMethod() { return this.method; }

    public void setCategory(String newCategory) { this.category = newCategory; }
    public void setAmount(double newAmount) { this.amount = newAmount; }
    public void setDate(String newDate) { this.date = newDate; }
    public void setMethod(String newMethod) { this.method = newMethod; }
 }