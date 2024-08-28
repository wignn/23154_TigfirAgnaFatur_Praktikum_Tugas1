package Two;

public class Nilai {
    String Nim;
    String Nama;
    double NilaiAbsen;
    int NilaiTugas;
    int NilaiUts;
    int NilaiUas;
    int NilaiAkhir;

    void Nilai(String Nim, String Nama, int NilaiAbsen, int NilaiTugas, int NilaiUts, int NilaiUas, int NilaiAkhir ) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.NilaiAbsen = NilaiAbsen;
        this.NilaiTugas = NilaiTugas;
        this.NilaiUts = NilaiUts;
        this.NilaiUas = NilaiUas;
        this.NilaiAkhir = NilaiAkhir;
    }

    void CetakNilai (){
        System.out.println("NIM: " + " " + Nim);
        System.out.println("Nama: " + " " + Nama);
        System.out.println("NilaiAbsen[10%]: " + " " + NilaiAbsen);
        System.out.println("NilaiTugas[20%]: " + " " + NilaiTugas);
        System.out.println("NilaiUts[30%]: " + " " + NilaiUts);
        System.out.println("NilaiUas[40%]: " + " " + NilaiUas);
        System.out.println("NilaiAkhir: " + " " + NilaiAkhir);
    }



}
