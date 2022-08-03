public class PieceWorkSalaryEmployee implements Employee {
    private double ratePerProduct;
    private double amountOfProducts;

    public PieceWorkSalaryEmployee(double ratePerProduct, double amountOfProducts) {
        this.ratePerProduct = ratePerProduct;
        this.amountOfProducts = amountOfProducts;
    }

    public double calculateSalary() {
        return this.ratePerProduct * this.amountOfProducts;
    }
}
