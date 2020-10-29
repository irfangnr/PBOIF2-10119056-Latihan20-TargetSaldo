/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan20.targetsaldo;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan target saldo
 */
public class PBOIF210119056Latihan20TargetSaldo {

    public static void main(String[] args) {
        // TODO code application logic here
        int bunga,saldo,saldoAwal,saldoTarget,saldoAkhir;
        
        saldoAwal = 3500000;
        bunga=8;
        saldoTarget=6000000;
        saldoAkhir=0;
        
        for (int i=1; saldoAkhir <= saldoTarget; i++){
        saldo=(saldoAwal * bunga/100) ;
        saldoAkhir=saldo+saldoAwal;
        System.out.println("saldo di bulan ke-"+ i + " Rp."+ saldoAkhir);
        saldoAwal+=saldo;
    }
    }
    
}
