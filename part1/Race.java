package JPL0Lab11.part1;

class myJavaThread {  // Lập Trình đa luồng :))) MutiThread chưa học
    int finish;
    String name;

    myJavaThread(){
    }
    myJavaThread(int finish, String name){
        this.finish = finish;
        this.name = name;
    }

    public void runmain(){
        for (int i = 0;i < 1;i++){
            System.out.println("New Thread : Thread["+name+","+finish+"main]");
        }
    }
    public void run5(){
        for (int i = finish; i > 4; i--) {
            System.out.println(name + ": " + (i) + " running...");
        }
    }
    public void run4(){
        for (int i = finish-1; i > 3; i--) {
            System.out.println(name + ": " + (i) + " running...");
        }
    }
    public void run3(){
        for (int i = finish-2; i > 2; i--) {
            System.out.println(name + ": " + (i) + " running...");
        }
    }
    public void run2(){
        for (int i = finish - 3; i > 1; i--) {
            System.out.println(name + ": " + (i) + " running...");
        }
    }
    public void run1(){
        for (int i = (finish-4) ; i > 0; i--) {
            System.out.println(name + ": " + (i) + " running...");
        }
        try {
            Thread.sleep(Math.round(Math.random() * 1500));
        }catch (Exception a){}
        System.out.println(name + " finished");
    }

}

class RaceCar extends myJavaThread {

    RaceCar(){
    }
    int finish;
    String name;

    RaceCar(int finish ,String name){
        super(finish,name);
        this.finish = finish;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < finish; i++) {
            System.out.println(name + ": " + (i + 1) + " running...");
        }
        try {
            Thread.sleep(Math.round(Math.random() * 5000));
        }catch (Exception a){}
        System.out.println(name + " Exiting");
    }

    public void prin() throws InterruptedException {
        for(int i =0;i < 10 ; i++){
            System.out.println(name);
        }
    }

}
public class Race{
    public static void main(String[] a) throws InterruptedException {
//        RaceCar in = new RaceCar();
        int n = 6;
        RaceCar[] cars = new RaceCar[n];
//        part 1 [
        cars[0] = new RaceCar(5, "Mario");
        cars[1] = new RaceCar(5, "Songoku");
        cars[2] = new RaceCar(5, "Herman");
        cars[3] = new RaceCar(10, "Doremon");
        cars[4] = new RaceCar(10, "Hoang Phi Hong");
        cars[5] = new RaceCar(10, "Nobita");
        for(int i=0; i<n; i++)
            cars[i].run();
//        ]

        // part 2 [
//        cars[0] = new RaceCar(5, "First");
//        cars[1] = new RaceCar(5, "Second");
//        cars[2] = new RaceCar(5, "Third");
//        for(int i=0; i<n; i++)
//            cars[i].runmain();
//        for(int i=0; i<n; i++)
//            cars[i].run5();
//        for(int i=0; i<n; i++)
//            cars[i].run4();
//        for(int i=0; i<n; i++)
//            cars[i].run3();
//        for(int i=0; i<n; i++)
//            cars[i].run2();
//        for(int i=0; i<n; i++)
//            cars[i].run1();
        // ]

        // part 3 [
//        String mess1 = "multithreading";
//        String mess2 = "multitasking";
//        cars[0] = new RaceCar(5, mess1);
//        cars[1] = new RaceCar(5, mess2);
//        System.out.println("MESSAGE  BOARD\n====================");
//        System.out.println("Number of messages : 2");
//        System.out.println("Message 1 : " + mess1 + "\nTimeOut : 1000 \nPriority : high");
//        System.out.println("Message 2 : " + mess2 + "\nTimeOut : 2000 \nPriority : medium");
//        System.out.println("Result : ");
//        for (int i = 0;i< 1;i++){
//            in.prin();
//        }
        // ]

    }
}
