package remote.cuacho;

public class BarkRecognizer {
    public ManageBark manga;
    private Remote remote;

    public BarkRecognizer(Remote remote) {
        this.remote = remote;
        manga = new ManageBark();
    }

    public void recognizer(String bark) {
        for (int i = 0; i < manga.arr.size(); i++) {
            if (bark.equals(manga.arr.get(i))) {
                System.out.println("thiet bi nhan dang tieng sua nghe thay tieng sua: " + bark);
                System.out.println("thiet bi nhan dang tieng sua gui yeu cau mo cua");
                remote.nhaNut();
            }
        }
    }
}
