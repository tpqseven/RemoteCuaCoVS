package remote.cuacho;

public class Remote {
    private CuaCho cua;

    public Remote(CuaCho cua) {
        this.cua = cua;
    }

    public void nhaNut() {
        if (cua.isTrangThai() == false) {
            cua.moCua();
            System.out.println("Cua cho tu dong sau 5s");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            cua.dongCua();
        } else {
            cua.dongCua();
        }
    }

    public CuaCho getCua() {
        return cua;
    }

    public void setCua(CuaCho cua) {
        this.cua = cua;
    }
}
