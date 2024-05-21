// SuperClass - ParentClass - BaseClass
// SubClass - ChildClass - DerivedClass
package Java_practice2.Single_Inheritance;

public class Programming {
    int version;
    String author;

    Programming(){
        System.out.println("DC of Programming");
    }
    Programming(int v1, String a1){
        this.version = v1;
        this.author = a1;
    }

    void printInfo(){
        System.out.println("Information: "+"\t"+this.version+"\t"+ "Created by:"+this.author);
    }
}
