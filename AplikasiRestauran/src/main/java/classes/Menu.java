/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author nndzrh
 */
public class Menu {
    private String nama_menu;
    private double harga;
    private String kategori;
        
    public String getNama_menu() {
        return nama_menu;
    }
        
    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }
	
    public double getHarga() {
        return harga;
    }
	
    void setHarga(double harga) {
        this.harga = harga;
    }
	
    public String getKategori() {
        return kategori;
    }
	
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    String getNamaMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNama_Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
