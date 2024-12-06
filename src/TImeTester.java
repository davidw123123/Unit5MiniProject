public class TImeTester {
    public static void main(String[] args) {
        Time time = new Time(23,58,58);
        System.out.println("EXPECTED RESULT: 23:58:58");
        System.out.println("ACTUAL RESULT: "+time);
        System.out.println();
        time.tick();
        System.out.println("EXPECTED RESULT: 23:58:59");
        System.out.println("ACTUAL RESULT: "+time);
        System.out.println();
        time.tick();
        System.out.println("EXPECTED RESULT: 23:59:00");
        System.out.println("ACTUAL RESULT: "+time);
        System.out.println();
        for (int i = 0;i < 60; i++){
           time.tick();
        }
        System.out.println("EXPECTED RESULT: 00:00:00");
        System.out.println("ACTUAL RESULT: "+time);
        System.out.println();
        Time time2 = new Time(18,45,12);
        Time time3 = new Time(7,20,50);
        time2.add(time3);
        System.out.println("EXPECTED RESULT: 02:06:02");
        System.out.println("ACTUAL RESULT: "+time2);
    }
}
