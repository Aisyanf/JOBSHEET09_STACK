import java.util.Scanner;

public class SuratDemo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat02 stack = new StackSurat02(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();

                    Surat02 s = new Surat02 (id, nama, kelas, jenis, durasi);
                    if (!stack.isFull()) {
                        stack.push(s);
                        System.out.println("Surat berhasil diterima!");
                    } else {
                        System.out.println("Stack penuh!");
                    }
                    break;
                
                case 2:
                    Surat02 suratProses = stack.pop();
                    if (suratProses != null) {
                        System.out.println("Memproses surat dari " + suratProses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;

                case 4:
                    System.out.print("Cari nama: ");
                    String cari = scan.nextLine();
                    stack.cari(cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}