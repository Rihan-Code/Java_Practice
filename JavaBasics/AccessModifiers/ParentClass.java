package AccessModifiers;
// Modifier  Class  Package  Subclass  WOrld
// public     yes    yes       yes      yes
// protected  yes    yes       yes      no
// default    yes    yes       no       no
// private    yes    no        no       no

public class ParentClass {
    public String publicField = "public field";
    private String privateField = "Private field";
    protected String protectedField = "Protected field";
    String defaultField = "Default Field";

    public void publicFunc() {
        System.out.println("Public method");
    }

    private void privateFunc() {
        System.out.println("Private Method");
    }

    protected void protectedFunc() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }
}
