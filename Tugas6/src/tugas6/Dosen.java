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
public class Dosen extends Pegawai{
    
    public int jumlahSKS, tarifSKS;
    
    Dosen(String nip, String nama, String alamat){
        super(nip,nama,alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    
    public void setGajiDos(int tarifSKS){
        this.tarifSKS=tarifSKS;
    }

    public int getJumlahSKS() {
        return jumlahSKS;
    }

    public int getTarifSKS() {
        return tarifSKS;
    }

    @Override
    public int getGaji(){
        super.gajiPeg=jumlahSKS*tarifSKS;
        return super.gajiPeg;
    }
    
    public void info(){
        System.out.println("Jumlah SKS: "+getJumlahSKS());
        System.out.println("Tarif per SKS: "+getTarifSKS());
        super.info();
    }
}
