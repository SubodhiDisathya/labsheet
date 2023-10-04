public class Calculate {
    public static void main(String [] args){
        Calculate Cal=  new Calculate();
        String ans= Cal.add(5,7);
        System.out.println(ans);

        String a= Cal.Sub(5,7);
        System.out.println(a);

        String m= Cal.mul(5,7);
        System.out.println(m);

        String d= Cal.div(5,7);
        System.out.println(d);
    }

    public String add (int num1, int num2){
        int ans = num1+num2;

        return "Answer is: "+ans;

    }
    public String Sub(int num1,int num2){
        int a=num1-num2;
        return "Answer is :"+ a;
    }
    public String mul(int num1,int num2) {
        int m = num1 * num2;
        return "Answer is :" + m;
    }
    public String div(int num1,int num2){
        int d=num1/num2;
        return "Answer is :"+ d;
    }
}