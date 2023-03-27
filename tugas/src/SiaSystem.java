public class SiaSystem {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nomer("41821120011");
        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.address);
        System.out.println(mahasiswa.contact);
        // mahasiswa.getMahasiswaInfo();

        Dosen dosen = new Dosen();
        dosen.nomer("4131120087");
        System.out.println(dosen.nama);
        System.out.println(dosen.address);
        System.out.println(dosen.contact);
        dosen.getDosenInfo();

    }    
}
