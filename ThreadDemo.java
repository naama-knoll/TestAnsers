public class ThreadDemo {
    public static void show(){


        ObjectChanging obj=new ObjectChanging();
        var t1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.increment();
                System.out.println(obj.getNumber());
            }
        });
        var t2=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.decrement();
                System.out.println(obj.getNumber());
            }
        });
        var t3=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.multiply();
                System.out.println(obj.getNumber());
            }
        });
        var t4=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.divide();
                System.out.println(obj.getNumber());
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("done");
    }
}
