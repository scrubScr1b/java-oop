package sia.app.dosen.application;

import sia.app.dosen.data.dosen;

public class dosenApp {

    public static void main(String[] args) {
        dosen dosen = new dosen();
        dosen.nama = "Jajang";
        dosen.gender = "Laki-Laki";
        dosen.setUmur(50);

        System.out.println(dosen.nama);
        System.out.println(dosen.gender);
        System.out.println(dosen.getUmur());        
    }
}
