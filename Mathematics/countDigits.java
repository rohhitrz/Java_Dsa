package Mathematics;

public class countDigits {

    static int count(int num) {
        int c = 0;
        if(num==0){
            c=1;
        }

        if(num<0){
            num=num*-1;
        }
        while (num > 0) {
            num = num / 10;
            c++;

        }
        return  c;
    }


    public static void main(String[] args) {
        int res = count(0);
        System.out.println(res);



    }
}