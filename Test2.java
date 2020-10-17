import java.util.Scanner;

class Test2 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String in = sin.nextLine();
        in=in.replace(" ","");

        char[] str=new char[in.length()];

        for (int i = 0; i < in.length(); i++) {
            str[i]=in.charAt(i);
        }

        int symind=0;
        int symind2=0;

        int a=0;
        int b=0;
        int d=0;
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


        for (int i = symind+1; i < str.length; i++) {
            switch (str[i]){
                case '+':
                    symind2=i;
                    break;
                case '-':
                    symind2=i;
                    break;
                case '*':
                    symind2=i;
                    break;
                case '/':
                    symind2=i;
                    break;
            }
        }


        for (int i = symind2-1; i > symind; i--) {
            int c=Character.getNumericValue(str[i]);
            d+=c*i2;
            i2*=10;
        }

        i2=1;

        for (int i = str.length-1; i >symind2; i--) {
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

        int out=0;


        if(str[symind]=='+' && str[symind2]=='+'){
            out=a+d+b;
        }
        if(str[symind]=='+' && str[symind2]=='*'){
            out=d*b+a;
        }
        if(str[symind]=='+' && str[symind2]=='/'){
            out=d/b+a;
        }
        if(str[symind]=='+' && str[symind2]=='-'){
            out=a+d-b;
        }


        if(str[symind]=='-' && str[symind2]=='+'){
            out=a-d+b;
        }
        if(str[symind]=='-' && str[symind2]=='-'){
            out=a-d-b;
        }
        if(str[symind]=='-' && str[symind2]=='*'){
            out=a-d*b;
        }
        if(str[symind]=='-' && str[symind2]=='/'){
            out=a-d/b;
        }


        if(str[symind]=='*' && str[symind2]=='+'){
            out=a*d+b;
        }
        if(str[symind]=='*' && str[symind2]=='-'){
            out=a*d-b;
        }
        if(str[symind]=='*' && str[symind2]=='*'){
            out=a*d*b;
        }
        if(str[symind]=='*' && str[symind2]=='/'){
            out=a*d/b;
        }


        if(str[symind]=='/' && str[symind2]=='+'){
            out=a/d+b;
        }
        if(str[symind]=='/' && str[symind2]=='-'){
            out=a/d-b;
        }
        if(str[symind]=='/' && str[symind2]=='*'){
            out=a/d*b;
        }
        if(str[symind]=='/' && str[symind2]=='/'){
            out=a/d/b;
        }

        System.out.println(out);

    }
}

