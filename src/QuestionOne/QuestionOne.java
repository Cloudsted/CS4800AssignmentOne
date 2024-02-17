package QuestionOne;
public class QuestionOne {

	public static void main(String args[]) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);

        // Instantiate a HourlyEmployee object
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);

        // Instantiate another HourlyEmployee object
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);

        // Instantiate a CommissionEmployee object
        CommissionEmployee commissionEmployee = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);

        // Instantiate a SalariedEmployee object with base salary (BaseEmployee)
        BaseEmployee baseEmployee = new BaseEmployee("Renwa", "Chanel", "555-55-5555", 0.0, 0, 1700);

        // Instantiate another BaseEmployee object
        BaseEmployee baseEmployee2 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 0.0, 0, 95000);

        // Instantiate another CommissionEmployee object with base salary
        BaseEmployee basePlusCommissionEmployee = new BaseEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000, 0);

	}
	
}
