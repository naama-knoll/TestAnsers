public class ObjectChanging {
    private int number;

    public synchronized int getNumber() {
        return number;
    }

    public synchronized void increment(){
        this.number+=5;
    }
    public synchronized void decrement(){
        this.number--;
    }
    public synchronized void multiply(){
        this.number*=10;
    }
    public synchronized void divide(){
        this.number/=10;
    }
}
