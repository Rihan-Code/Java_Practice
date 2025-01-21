public class ControlFlow {
    public static void main(String[] args) {
        //Conditional Statements
        int num = 5;

        // if-else
        if(num > 0) System.out.println("Positive number");
        else System.out.println("Negative Number");

        // switch-case
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }

        // for-loop
        // find even numbers in between 10 to 50
        System.out.println("Even numbers between 10 to 50 are: ");
        for(int i=10; i<=50; i++) {
            if(i % 2 == 0) System.out.println(i);
        }

        // while-loop
        //find odd numbers in between 10 to 50
        int i = 10;
        System.out.println("Odd numbers between 10 to 50 are: ");
        while(i <= 50) {
            if(i % 2 == 1) System.out.println(i);
            i++;
        }
    }
}
