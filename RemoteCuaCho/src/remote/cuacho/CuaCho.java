package remote.cuacho;

public class CuaCho {
    private boolean trangThai = false;

    public void dongCua() {
        System.out.println("dong cua");
        trangThai = false;
    }

    public void moCua() {
        System.out.println("mo cua");
        trangThai = true;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
