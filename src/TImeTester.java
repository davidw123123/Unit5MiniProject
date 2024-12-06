public class TImeTester {
    public static void main(String[] args) {
        Time time = new Time(23,58,58);
        time.tick();
        System.out.println(time);
        time.tick();
        System.out.println(time);
        for (int i = 0;i < 60; i++){
           time.tick();
        }
        System.out.println(time);
        time.tick();
        time.tick();
        System.out.println(time);
        Time time2 = new Time(18,45,12);
        Time time3 = new Time(7,20,50);
        time2.add(time3);
        System.out.println(time2);
    }
}
