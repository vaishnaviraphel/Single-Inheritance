package Java_practice2.Single_Inheritance;

public class Java1 extends Programming {
    String newFeature;
    Java1(){
        System.out.println("DC of Java1");
    }

    Java1(String newFeature){
        this.newFeature = newFeature;
    }

    void printInfo(){
        System.out.println("Feature is: "+this.newFeature);
    }
}
