public class Main {
    public static void main(String[] args) {


        //HISTORY
        final String TITLE = "UYJOY";
        final int FOUNDED_IN = 2024;
        final  String MONTH = "February";
        final String FIRST_BRANCH_COUNTRY = "Uzbekistan";
        final String FIRST_BRANCH_CITY = "Samarkand";

        System.out.println();
        System.out.println("Step 3:");
        System.out.println();
        //One if
        System.out.println("1-One if");

        byte Company_status = 0;
        if (Company_status == 1){
            System.out.println("Company is working now");
        }
        if (Company_status == 0){
            System.out.println("Company currently is not working");
        }
        System.out.println("2-One if-else");

        //DEPARTMENTS
        String Dep1 = "It Department";
        String Dep2 = "Smm Department";
        String Dep3 = "Cyber Security Department";
        String Dep4 = "Designers Department";
        String Dep5 =  "Finance and Mortgage Department";
        String Dep6 = "Customer Service";

        //One if-else
        String Dep_Status = "It ";

        if (Dep_Status == "It Department" || Dep_Status == "Smm Department" ||  Dep_Status == "Cyber Security Department" || Dep_Status == "Cyber Security Department" ||
        Dep_Status == "Designers Department" || Dep_Status == "Finance and Mortgage Department" || Dep_Status == "Customer Service" ){
            System.out.println("There is a "+Dep_Status+", permission granted");
        }
        else {
            System.out.println("There is no "+Dep_Status+" Department, permission denied");
        }
        System.out.println("3-One if-elseif-else if .....-else");

        //Amount of Departments workers
        byte It_Department = 25;
        byte Smm_Department = 30;
        byte Cyber_Security_Department = 12;
        byte Designers_Department = 35;
        byte Finance_and_Mortgage_Department = 23;
        byte Customer_Service_Department = 10;
        short Total_Amount = 135;

        //One if-elseif-else if .....-else
        String Number_of_workers = "It Department";

        if (Number_of_workers == "It Department"){
            System.out.println("It Department has: " + It_Department + " workers");
        }
        else if (Number_of_workers == "Smm Department") {
            System.out.println("Smm Department has: " + Smm_Department + " workers");
        }
        else if (Number_of_workers == "Cyber Security Department") {
            System.out.println("Cyber Security Department has: " + Cyber_Security_Department + " workers");
        }
        else if (Number_of_workers == "Designers Department") {
            System.out.println("Designers Department has: " + Designers_Department + " workers");
        }
        else if (Number_of_workers == "Finance and Mortgage Department") {
            System.out.println("Finance and Mortgage Department has: " + Finance_and_Mortgage_Department + " workers");
        }
        else if (Number_of_workers == "Customer Service Department") {
            System.out.println("Customer Service Department has: " + Customer_Service_Department + " workers");
        }
        else if (Number_of_workers == "Total Amount of workers") {
            System.out.println("Total number of workers is" + Total_Amount);
        }
        else {
            System.out.println("There is no Such Department");
        }
        System.out.println("4-One nested if");

        //SALARY
        int itSalary = 5000;
        int smmSalary = 4500;
        int cyberSecuritySalary = 5500;
        int designersSalary = 6000;
        int financeAndMortgageSalary = 4500;
        int customerServiceSalary = 4000;
        int Others = 1000; // Cleaning, Delivery, Media, Departments


        //TAXES
        double Total_Taxes_Workers = 125697.5;
        double Tax_for_Property = 3802.24;
        float Google_Play_Store = 30.0f; // in percent (30%)
        float Apple_App_Store = 30.0f;// in percent (30%)
        float Government_Tax = -25.0f;// in percent (25%)
        float Government_Duty = -24.0f;//in millions


        //PARTNERS
        String Org1 = "Furniture Factory";
        String Org2 = "Delivery Company";
        String Org3 = "Construction Company";


        //Branches
        byte Uzbekistan = 10;
        byte America = 2;
        byte Russia = 4;
        byte China = 1;

        //One nested if
        String country = "Uzbekistan";
        short Number_of_Branches = 10;

        if (country == "Uzbekistan"){
            if (Number_of_Branches == 10){
                System.out.println("Country is " + country + " and it has " + Number_of_Branches + " Branches");
            }
            else {
                System.out.println("There is no branch in " + country);
            }
            System.out.println("5-One Switch case");
        }

        //Branches Status(Working or Not)
        boolean American_1st_Branch = false;//in Progress(Soon will be opened)
        boolean Russian_2nd_Branch = false;//in Progress(Soon will be opened)
        boolean Uzbekistan_9th_Branch = false;//in Progress(Soon will be opened)
        boolean Uzbekistan_10th_Branch = false;//in Progress(Soon will be opened)


        //Productivity of Department, Grading System(A:5, B:4, C:3, D:2, E:1)
        char It_Department_Grade = 'A';
        char Smm_Department_Grade = 'A';
        char Cyber_Security_Department_Grade = 'A';
        char Designers_Department_Grade = 'C';
        char Finance_and_Mortgage_Department_Grade = 'A';
        char Customer_Service_Grade = 'B';

        //One Switch case
        char Grade = 'A';

        switch (Grade){
            case 'A' : System.out.println("Your grade is 5 in our system"); break;
            case 'B': System.out.println("Your grade is 4 in our system"); break;
            case 'C' : System.out.println("Your grade is 3 in our system"); break;
            case 'D': System.out.println("Your grade is 2 in our system"); break;
            case 'E' : System.out.println("Your grade is 1 in our system"); break;
            default:
                System.out.println("Enter the right garde!!!");
        }
        System.out.println();
        System.out.println("STEP 4:");
        System.out.println();
        System.out.println("1-One for loop");

        //for loop
        String[] Departments = {Dep1, Dep2, Dep3, Dep4, Dep5, Dep6};
        int[] Salary = {itSalary, smmSalary, cyberSecuritySalary, designersSalary,
        financeAndMortgageSalary, customerServiceSalary};
        int[] Number_of_Workers = {It_Department, Smm_Department, Cyber_Security_Department_Grade, Designers_Department,
                Customer_Service_Department, Finance_and_Mortgage_Department};

        for (int i = 0; i <= 5; i++){
            System.out.print(Departments[i]);
            System.out.print(": Salary of Department's workers: " + Salary[i] +
                    ", The number of employees: ");
            System.out.println(Number_of_Workers[i]);
        }
        System.out.println("2-One while loop");



        short months = 1;
        short year = 1;
        //One while loop
        System.out.println("Year "+year);
        while (Government_Duty != 0){
            Government_Duty++;
            System.out.println("Month number: " + months + ",amount of Duty left form Government " +
                    Government_Duty+" millions");

            months++;
//            System.out.println(months);
            if (months == 13){
                months=1;
                year++;
                System.out.println("Year " + year);
            }

        }
        System.out.println();
        System.out.println("Duty Covered in "+ (year-1)+" years");
        System.out.println("Duty status from Government is " + Government_Duty + " million dollars");
        System.out.println("3-One do-while");

        //do-while
        int Salary_of_Dep = 6000;

        do {

            if (Salary_of_Dep==designersSalary){
                System.out.println("Designer's Salary is: " + Salary_of_Dep);
            }
            else if (Salary_of_Dep==cyberSecuritySalary) {
                System.out.println("Cyber Security Department's Salary is: " + Salary_of_Dep);
            }
            else if (Salary_of_Dep==itSalary) {
                System.out.println("It Department's Salary is: " + Salary_of_Dep);
            }
            else if (Salary_of_Dep==smmSalary || Salary_of_Dep==itSalary ) {
                System.out.println("Smm Department's and Finance Mortage Department's Salary " + Salary_of_Dep);
            }
            else if (Salary_of_Dep==customerServiceSalary) {
                System.out.println("Customer Service Department's Salary "+ Salary_of_Dep);
            }
            else if (Salary_of_Dep==Others) {
                System.out.println("Other Department's Salary "+Salary_of_Dep);
            }
            Salary_of_Dep -= 500;
        }
        while(Salary_of_Dep != 0);






    }
}