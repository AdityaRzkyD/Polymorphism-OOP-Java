public class Perhitungan {
    public static void main(String[] args) {
        Balok bl = new Balok(3, 5, 2);
        Kubus kb = new Kubus(5, 7, 3, 9);

        bl.cetak();
        System.out.println("Volume Balok    : "+bl.VolumeBalok());
        System.out.println("Luas Balok      :"+bl.LuasBalok());

        kb.cetak();
        System.out.println("Volume Kubus    : "+kb.VolumeKubus());
        System.out.println("Luas Kubus      : "+kb.LuasKubus());
    }
}
