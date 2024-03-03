import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        // // Primera forma
        //calendario.set(2024, Calendar.SEPTEMBER, 25,18,20,10);

        // // Segunda forma
        calendario.set(Calendar.YEAR,2024);
        calendario.set(Calendar.MONTH,Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.HOUR,8);
        calendario.set(Calendar.AM_PM,Calendar.PM);

        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = "+fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha con formato = " + fechaConFormato);

    }
}
