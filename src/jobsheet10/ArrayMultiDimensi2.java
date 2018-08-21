/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author asus
 */
public class ArrayMultiDimensi2 {
    int nis [][] = {{210650},{210651},{210652}};
	String nama [][] = {{"Akbar "},{"Vito "},{"Hartono"}};
	
	public void namanis (int n){
	for (int i = 0; i< 1; i++){
	for (int j = 0; j < 1; j++){
	System.out.println(nama[1][j]+":"+nis[1][j]);
	
	}
	}
	}
        public static void main(String[] args) {
        ArrayMultiDimensi2 siswa = new ArrayMultiDimensi2();
	
	siswa.namanis(0);
	}
}
