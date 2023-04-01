package sia.app.dosen.data;

import sia.app.abstracts.person;

public class dosen extends person{
    private Number umur;

    public void setUmur (Number umur) {
        this.umur = umur;
    }

    public Number getUmur() {
        return this.umur;
    }
}
