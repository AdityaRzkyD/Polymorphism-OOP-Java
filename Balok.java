public class Balok{
        private int p, l, t;

        protected Balok(int p, int l, int t){
            this.p=p;
            this.l=l;
            this.t=t;
        }

        public int VolumeBalok(){
            return p*l*t;
        }

        protected int LuasBalok(){
            return 2*(p*l+p*t+l*t);
        }

        public void cetak(){
            System.out.println("Perhitungan Balok");
        }
}