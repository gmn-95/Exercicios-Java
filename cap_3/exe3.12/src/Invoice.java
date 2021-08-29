public class Invoice {
    private String invoiceNumber;
    private String description;
    private int    quantity;
    private double price;

    public Invoice(String invoiceNumber, String description, int quantity, double price){
        this.invoiceNumber  = invoiceNumber;
        this.description    = description;
        this.quantity       = quantity;
        this.price          = price;
    }

    public double getInvoice(){
        if(quantity < 0){
            return 0;
        }
        if(price < 0){
            return 0.0;
        }
        return price * quantity;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
