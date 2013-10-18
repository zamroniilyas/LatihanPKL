import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Chromatics
 */
public class TestLamaPeminjman {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            //Konversi dari string ke tanggal
            String tPinjam = "12-04-2013";
            String tKembali = "12-04-2013";

            Date TanggalPinjam =df.parse(tPinjam);
            Date TanggalKembali = df.parse(tKembali);

            //Tgl di konversi ke milidetik
            long Hari1 = TanggalPinjam.getTime();
            long Hari2 = TanggalKembali.getTime();
            long diff = Hari2 - Hari1;
            long Lama = diff / (24 * 60 * 60 * 1000);

            System.out.println(Lama);
        } catch (ParseException e){
            System.err.println(e.getMessage());
        }
    }
}
