public class girl extends people{
    String doll;
    girl(String d,Integer a, Float h,Float w){
        super("girl",a,h,w);
        doll=d;
    }
    public String like(){
        return doll;
    }
}
