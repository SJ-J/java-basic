package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData ad = new AccessData();

        ad.publicField = 1;
        ad.publicMethod();
        ad.defaultField = 2;
        ad.defaultMethod();

        ad.innerAccess();
    }
}
