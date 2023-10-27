public class Kubus extends Balok{
    private int r;

    public Kubus(int p, int l, int t, int r){
        super(p, l, t);
        this.r=r;
    }

    public int VolumeKubus(){
        return r*r*r;
    }

    public int LuasKubus(){
        return super.LuasBalok();
    }

    public void cetak(){
        System.out.println("Perhitungan Kubus");
    }
}
