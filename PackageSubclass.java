import AccessModifiers.ParentClass;

public class PackageSubclass {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.publicFunc(); // accessible
        // obj.privateFunc(); // unaccessible
        // obj.protectedFunc(); // unaccessible
        // obj.defaultMethod(); // unaccessible
    }
}
