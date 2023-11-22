public class VirtualDemo {
    public static void main(String[] args) throws Exception {
        
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji("ini nama", "Samarinda", 2, 2500.00);
        Pegawai p = new Pegawai("adudu", "depok", 9);

        System.out.println();

        //kelas gaji, konstruktor gaji
        System.out.println("Memanggil mailCheck berdasarkan referensi gaji");
        s.mailCheck();

        //kelas pegawai, konstruktor gaji
        System.out.println("\nMemanggil mailCheck berdasarkan referensi pegawai");
        e.mailCheck();

        //kelas pegawai, konstruktor pegawai
        System.out.println("\nMemanggil mailCheck berdasarkan referensi pegawai");
        p.mailCheck();

    }
}
