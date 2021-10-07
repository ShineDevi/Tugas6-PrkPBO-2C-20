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
public class DaftarGaji {
    public int jml, i;
    public Pegawai listPegawai[];
    
    DaftarGaji(int jml){
        this.jml=jml;
        this.listPegawai=new Pegawai[jml];
    }
    
    public void addPegawai(Pegawai p){
        if (i<listPegawai.length) {
            listPegawai[i]=p;
            i++;
        } else {
            System.out.println("Data penuh!");
        }
    }
    
    public void printSemuaGaji(){
        System.out.println("============GAJI=============");
        int idx=0;
        for (Pegawai p:this.listPegawai) {
            if (idx<i) {
                p.info();
                idx++;
            }
        }
    }
}
