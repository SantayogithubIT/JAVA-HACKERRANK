



public class bitwisedemo {

    public static void main(String[] args) {
        int x=-0b1010;
        int y;
        y=~x;
        //y=x>>1;
        System.out.println(String.format("%s", Integer.toBinaryString(y)));
        System.out.println(String.format("%32s", Integer.toBinaryString(x)));

    }
}