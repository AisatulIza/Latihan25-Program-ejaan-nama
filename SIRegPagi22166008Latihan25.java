package pkgLatihan25;
import java.util.Scanner;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan ejaan nama yang inputannya dari user
*/
public class SIRegPagi22166008Latihan25 {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    // input nama 
    System.out.print("Masukkan nama depan anda untuk di eja :");
    String nama = input.nextLine();
    //output nama 
    System.out.println("Ejaan untuk " +nama+ " adalah : ");
    //perulangan for 
    for (int i = 0 ; i <nama.length(); i++) {
        //output huruf dari yang pertama 
        System.out.println("Huruf ke-" +(i+1)+": " + nama.charAt(i));
    }
  }
}
