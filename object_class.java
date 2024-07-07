class SAMPLE
{
    int a;
    int b;
}

public class object_class{
    public static void main(String args[])
    {
        SAMPLE s1 = new SAMPLE();
        SAMPLE s2 = new SAMPLE();
        s1.a = 10;
        s1.b = 20;
        s2.a = 30;
        s2.b = 40;
        System.out.println(s1.a);
        System.out.println(s1.b);
        System.out.println(s2.a);
        System.out.println(s2.b);
    }
}





/*class (like a mould of a soap ) and object (is the soap that is made from mould)
class is a blueprint of an object
class is a template of an object
class - properties and methods
* consider a class "SAMPLE" having 2 variables int a and int b
if only class is existing we can't use int a and int b 
to use int a and int b we need to create an object of SAMPLE class
suppose 2 objects -obj1 and obj2 are created from  class then the memory 
space is independent of each other.
value can be placed in object
object is an instance of a class

 */
