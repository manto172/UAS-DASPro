/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author WINDOWS 11
 */
public class RuanganAC implements ACinterface {
 int statusRuanganAC;
 public void hidupkan(){
if (statusRuanganAC == KEADAAN_MATI){
statusRuanganAC = KEADAAN_HIDUP;
System.out.println("Hidupkan AC Ruangan! --> AC Hidup");
}else{
System.out.println("Hidupkan AC Ruangan! --> AC sudah di Hidupkan BossKu!!");}
}
 public void matikan(){
if (statusRuanganAC == KEADAAN_HIDUP){
statusRuanganAC = KEADAAN_MATI;
System.out.println("Matikan AC Ruangan! --> AC Mati");
}else{
System.out.println("Matikan AC Ruangan! --> AC Sudah DiMatikan BossKu!!");
}
}
}
