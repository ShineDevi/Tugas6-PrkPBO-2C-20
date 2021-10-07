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
public class Tugas6 {

    public static void main(String[] args) {
        DaftarGaji d=new DaftarGaji(4);
        Pegawai p1=new Pegawai("112233", "Hans", "Sumber Porong");
        p1.setGajiPeg(2500000);
        Pegawai p2=new Pegawai("112234", "Tyas", "Kediri");
        p2.setGajiPeg(3000000);
        Pegawai p3=new Pegawai("112235", "Hani", "Kediri");
        p3.setGajiPeg(4000000);
        Dosen dos1=new Dosen("223311", "Monica", "Lawang");
        dos1.setSKS(32);
        dos1.setGajiDos(100000);
        d.addPegawai(p1);
        d.addPegawai(p2);
        d.addPegawai(p3);
        d.addPegawai(dos1);
        d.printSemuaGaji();
    }
    
}
