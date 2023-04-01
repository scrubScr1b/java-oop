package sia.app.mahasiswa.data;

import sia.app.abstracts.person;

public class mahasiswa extends person {
    public String nim;
    public String nama;
    public String phoneNumber;

    public mahasiswa(String nim, String nama, String gender,String phoneNumber){
        this.nim = nim;
        this.nama = nama;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
}
