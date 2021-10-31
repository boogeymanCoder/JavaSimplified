public class Switch {
    public static void main(String[] args) {
        int num = 4;

        switch (num) {
        case 1:
            System.out.println("Its value is 1!");
            break;
        case 2:
            System.out.println("Its value is 2!");
            break;
        case 3:
            System.out.println("Its value is 3!");
            break;
        case 4:
            System.out.println("Its value is 4!");
            break;
        default:
            System.out.println("Its value did not match!");
            break;
        }
    }
}
