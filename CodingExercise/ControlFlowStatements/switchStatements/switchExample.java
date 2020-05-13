package controlFlowStatements;

public class SwitchTest {

    public static void main(String[] args) {
        testing();
    }

    public static void testing() {
        int switchValue = 1;

        switch (switchValue) {
            //insert expression/ variable name within parenthesis
            case 1:
                //if expression switchValue equals equals 1;
                System.out.println("Value was 1");
                break;
                //terminate enclosing switch statement
                //breaks are vital to close off case comparison
                //otherwise breaks will fall through to the next case and print the following until
                //reaches the next break, or until it finishes off switch statement
            case 2:
                //if switchValue variable == 2;
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was neither 1 or 2");
                break;
                //break not needed at default but good to have to be precise
        }
    }
}
