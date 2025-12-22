public class FlowchartReview {

    public static void main(String[] args) {

        // 1. Voting Age Check
        int age = 20;
        System.out.println("Voting Age Check:");
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        System.out.println("---------------------");

        // 2. Loan Eligibility
        int loanAge = 25;
        int income = 30000;
        System.out.println("Loan Eligibility Check:");
        if (loanAge >= 21 && income >= 20000) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Rejected");
        }

        System.out.println("---------------------");

        // 3. Traffic Light System
        char signal = 'G';
        System.out.println("Traffic Light System:");
        if (signal == 'R') {
            System.out.println("STOP");
        } else if (signal == 'Y') {
            System.out.println("READY");
        } else if (signal == 'G') {
            System.out.println("GO");
        } else {
            System.out.println("Invalid Signal");
        }
    }
}
