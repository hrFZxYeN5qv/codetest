public class boy extends people {

    String BallTeam;
    Pet pet;
    boy(String b,Integer a, Float h,Float w ){
        super("boy",a,h,w);
        BallTeam=b;
    }

    public void givePet(Pet p){
        pet=p;
    }
    
}
