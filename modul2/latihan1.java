package semester4.modul2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> hewan = new ArrayList<>();
        System.out.println("Masukkan nama-nama hewan : ");
        String[] namaHewan = input.nextLine().split(" ");
        for (String h : namaHewan){
            hewan.add(h);
        }

        System.out.println("Hewan : " +hewan);

        List<String> deleteHewan = new ArrayList<>();
        System.out.println("Masukkan nama-nama hewan yang akan dihapus : ");
        String[] namaDeleteHewan = input.nextLine().split(" ");
        for (String dh : namaDeleteHewan){
            deleteHewan.add(dh);
        }

        System.out.println("Delete Hewan : " +deleteHewan);

        for (String dh : deleteHewan){
            while (hewan.contains(dh)){
                hewan.remove(dh);
            }
        }

        System.out.println("Data Hewan yang Baru : " +hewan);
    }
}
