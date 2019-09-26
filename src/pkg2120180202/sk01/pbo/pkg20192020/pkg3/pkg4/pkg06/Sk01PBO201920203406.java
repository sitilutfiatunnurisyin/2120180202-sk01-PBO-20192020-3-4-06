/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180202.sk01.pbo.pkg20192020.pkg3.pkg4.pkg06;

/**
 *
 * @author asus
 */
public class Sk01PBO201920203406 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Siti Lutfiatun N
        int tinggi, setengahTinggi;
           tinggi = 10;
        int l = 1;
        int n = tinggi/2;
        System.out.println();
        System.out.println("output: ");
        for(int i=1;i<=n;i++){
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=l;j++){
                System.out.print("6");
            }
                l+=2;
                System.out.println("");
        }
        l -= 4;
        for(int i=(n-1);i>=1;i--){
            for(int k=i;k<=(n-1);k++){
                System.out.print(" ");
            }
            for(int j=l;j>=1;j--){
                System.out.print("6");
            }
            l-=2;
            System.out.println("");
        }
    }
    
}
