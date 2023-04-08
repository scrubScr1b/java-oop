package sia.app.mahasiswa.application;

import sia.app.mahasiswa.data.mahasiswa;

public class mahasiswaApp {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("41821120011", "Rafly Triansyah Praseptyo","Non Binary","085893109870");
        System.out.println(mhs.nim);
        System.out.println(mhs.nama);
        System.out.println(mhs.gender);
        System.out.println(mhs.phoneNumber);
        
    }
}
