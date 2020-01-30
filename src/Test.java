public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator("t1"));
        Thread t2 = new Thread(new NumberGenerator("t2"));
        try {
            t1.setPriority(Thread.MAX_PRIORITY);
//            t2.setPriority(Thread.MIN_PRIORITY);
            t1.sleep(500);
            t2.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        t2.start();
    }
}
