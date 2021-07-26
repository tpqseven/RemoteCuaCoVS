package remote.cuacho;

public class TestDriverCuaCho {
    public static void main(String[] args) {

        CuaCho cua = new CuaCho();
        BarkRecognizer barkRecognizer = new BarkRecognizer(new Remote(cua));
        System.out.println("Fido muon ra ngoai nen sua");
        barkRecognizer.recognizer("gau gau");
        System.out.println("Fido di ra ngoai");
        System.out.println("Fido di tac nghiep");
        System.out.println("Fido di tac nghiep xong, fido muon vo nha ne sua");
        barkRecognizer.recognizer("au au");
        System.out.println("Fido di vao nha");
//hahahaha
    }
}
