public class Application {
    public static void main(String args[]) {

        PieceWorkSalaryEmployee employee = new PieceWorkSalaryEmployee(5.0,945.0);
        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();


        BonusSalaryEmployee employee2 = new BonusSalaryEmployee(2000.00, true);
        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employee2);
        processor2.processPayout();
    }
}
