package AccessModifiers;

public class ChildClass extends ParentClass{
    public void accessParentMembers() {
        System.out.println(publicField); //accessible
        
        // System.out.println(privateField); // unaccessible, giving error

        System.out.println(protectedField); //accessible

        System.out.println(defaultField); //accessible, since from same package

        publicFunc(); // accessible
        // privateFunc(); // unaccessible since private
        protectedFunc(); // accessible
        defaultMethod(); //accessible, since same package
    }
}

//Encapsulation: private members or elements are essential for hiding internal data and controlling access

//Inheritance: protected ensures that subclass can use the parent class members

//Package structure: default keeps access within the same package, encouraging modular design

//Global acessibility: public ensures access from anywhere but should be used cautiously
