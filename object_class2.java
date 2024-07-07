class SAMPLE{
    int a;
    int b;

    void display(){
        System.out.println("a = "+a);
    }
}


public class object_class2 {
    public static void main(String[] args) {
        SAMPLE s1 = new SAMPLE();
        SAMPLE s2 = new SAMPLE();
        s1.a = 10;
        s1.b = 20;
        s2.a = 30;
        s2.b = 40;
        s1.display();
        s2.display();

    } 
}
