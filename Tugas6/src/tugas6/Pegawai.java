/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

/**
 *
 * @author -LENOVO-
 */
public class Pegawai {
    
    public String nip, nama, alamat;
    int gajiPeg;
    
    Pegawai(String nip, String nama, String alamat){
        this.nip=nip;
        this.nama=nama;
        this.alamat=alamat;
    }

    public void setGajiPeg(int gajiPeg) {
        this.gajiPeg = gajiPeg;
    }
    
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getGaji() {
        return gajiPeg;
    }
    
    public void info(){
        System.out.println("Nama: "+getNama());
        System.out.println("NIP: "+getNip());
        System.out.println("Alamat: "+getAlamat());
        System.out.println("Besar gaji: "+getGaji());
        System.out.println("-----------------------------");
    }
}
