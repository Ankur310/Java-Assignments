package Question4;

public class Factory {
    public RuppeeNote Factory(int amt){
        if(amt==10){
            return new s1();
        }
        else if(amt == 100){
            return new s2();
        }
        else if(amt==1000){
            return  new s3();
        }
        else return null;
    }

}

