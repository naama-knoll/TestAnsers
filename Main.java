import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //question 1
        System.out.println("enter a name and id");
        var scanner=new Scanner(System.in);
        var name=scanner.next();
        var id=scanner.nextInt();
        var newNumber=id%10;
        var placeNumber=(id%100)/10;

        int part1= (int) (id/Math.pow(10,placeNumber));
        int part2= (int) (id%Math.pow(10,placeNumber));
        System.out.println(part1);
        System.out.println(part2);

        String p1= String.valueOf(part1);
        String p2= String.valueOf(part2);
        String pn= String.valueOf(newNumber);
        String finalNumber=p1+pn+p2;
        System.out.println(name + " "+ finalNumber);


        //question 2
        int [][] smallMatrix=new int[10][10];
        int [][] bigMatrix=new int [40][40];
        System.out.println("enter 40*40 values to the big matrix");
        for(int i=0;i<40;i++){
            for(int j=0;j<40;j++){
                bigMatrix[i][j]=scanner.nextInt();
            }
        }

        System.out.println("enter 10*10 values for the small matrix");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                smallMatrix[i][j]=scanner.nextInt();
            }
        }
        boolean flag=false;
        for(int i=0;i<31;i++){
            for (int j=0;j<31 ;j++){
                if(bigMatrix[i][j]==smallMatrix[0][0]) {
                    flag = true;
                    for(int t=0;t<10;t++){
                        for(int t2=0;t2<10;t2++){
                            if(bigMatrix[i+t][j+t2]!=smallMatrix[t][t2]){
                                flag=false;
                                break;
                            }
                        }
                    }
                }
            }
        }

        if(flag)
            System.out.println(" the small matrix is in the big one");
        else
            System.out.println(" the small matrix is not in the big one");

        //question 3
        ThreadDemo.show();

        //question 4
        var x4=scanner.nextInt();
        var n=scanner.nextInt();

        boolean sign=false;//negetiv
        double sum=0;
        for(var i=1;i<=n;i++){
            if(!sign){
                sum-=(Math.pow(x4,i*2))/calcAtzeret(i);
            }
            else{
                sum+=Math.pow(x4,i*2)/calcAtzeret(i);
            }
            sign=!sign;
        }
        System.out.println(sum);


        //question 5-9
        var myList=new MyProtectedUniqueList("password");
        myList.add("bamba","password");
        myList.add("naama","password");
        myList.add("naama","password");
        myList.add("hodi","password");
        myList.add("ari","password");
        myList.remove("bamba","password");
        myList.removeAt(3,"password");
        myList.sort("password");
       // myList.clear("password");

        for(var item:myList){
            System.out.println(item);
        }
        System.out.println(myList);

    }
    //help func to question 4
    public static int calcAtzeret(int num){
        int sum=1;
        for(int i=2;i<=num;i++)
            sum*=i;
        System.out.println(sum);
        return sum;
    }

}
