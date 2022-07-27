

public class Hello {


    public Hello(int s){
        System.out.println(s);
    }

    public static void main(String arg[]){
        //HelloTest(arg);
        System.out.println(arg.length);
        if(arg.length > 0)
            Hello.c(Integer.valueOf(arg[0]));
        Hello h=new Hello(Integer.parseInt("223233232"));
        h.c(233444);
        return;
    }
    public static void HelloTest(String arg[]){
        //System.out.println(arg);
        //System.out.println(arg[0]);
        //System.out.println(arg[1]);
        System.out.println(String.valueOf(arg.length));
        if(0<arg.length)
            for(int i=0;i<arg.length;i++){
                System.out.println(arg[i]);
            }

            for(int i=arg.length;i>0;i--){
                System.out.println(arg[i-1]);
            }
            


        float[] f={1,2,3,4,5,6,7,8,9,4,3,3,3,3};

        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }

        System.out.print("\n\nSort\n\n");
        for(int i=0;i<f.length;i++){
            for (int j=0;j<i;j++){
                float tmp;
                if(f[i]<f[j]){
                    tmp=f[i];
                    f[i]=f[j];
                    f[j]=tmp;
                }
            }
        }

        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }

        System.out.print("\n\n");
    }


    public static int c(int x){
        int s;
        for(s=2;s<x;s++){
            if(x%s==0){
                System.out.println(String.valueOf(s));
                c(x/s);
                break;
            }
        }
        if(s==x){
            System.out.println(String.valueOf(s));
        }
        return 0;
    }
}