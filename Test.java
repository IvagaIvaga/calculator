import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String in = sin.nextLine();
        in=in.replace(" ","");

        char[] str=new char[in.length()];

        for (int i = 0; i < in.length(); i++) {
            str[i]=in.charAt(i);
        }

        int symind=0;

        int a=0;
        int b=0;
        int i2=1;

        for (int i = 0; i < str.length; i++) {
            if(str[i]=='+'){
                symind=i;
                break;
            }
            if(str[i]=='-'){
                symind=i;
                break;
            }
            if(str[i]=='*'){
                symind=i;
                break;
            }
            if (str[i] == '/'){
                symind=i;
                break;
            }
        }

        for (int i = str.length-1; i >symind; i--) {

            int c=Character.getNumericValue(str[i]);

            b+=c*i2;

            i2*=10;
        }

        i2=1;

        for (int i = symind-1; i >-1; i--) {
            int c=Character.getNumericValue(str[i]);
            a+=c*i2;
            i2*=10;
        }

        switch (str[symind]){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}

