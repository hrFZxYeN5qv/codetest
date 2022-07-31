public class obj {
    Float Hight;
    Float Weight;
    
    obj(Float h, Float w){
        Hight=h;
        Weight=w;
    }

    obj(Integer h, Integer w){
        int i=h;
        float f=(float) i;
        Hight=f;

        i=w;
        f=(float)i;
        Weight=f;

    }

    public Integer getHight(){
        System.out.println(String.valueOf(Hight));
        float f=Hight;
        int i=(int) f;
        Integer ret= i;
        return ret;
    }

    public Integer getWeight(){
        float f=Weight;
        int i=(int) f;
        return i;
    }

    /*
    public String toString(){
        return "Obj";
    } */
}
