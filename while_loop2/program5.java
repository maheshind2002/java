package while_loop2;
 
// Design and implement a Java program that simulates a countdown reminder for an upcoming deadline using a while loop
class Pro5 {
    public static void main(String[] args) {
        int day = 7;
        while (day >= 0) {
            if (day > 0) {
                System.out.println(day + " Days remaining...");

            } else {
                System.out.println(day + " hurry up its too late");
            }
            day--;

        }

    }
}