import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Instanciando {
    public static void main(String[] args) throws Exception {
    
    //**INSTANCIAÇÃO**
        //serve para configurar a data de um jeito diferente
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //data do local onde vc esta
        LocalDate d01 = LocalDate.now();
        //data e hora de onde vc esta
        LocalDateTime d02 = LocalDateTime.now();
        //data e hora do horario universar (Z = Londres)
        Instant d03 = Instant.now();

        //vc altera a data e horarios
        LocalDate d04 = LocalDate.parse("2024-02-05");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-05T01:30:40");
        Instant d06 = Instant.parse("2024-02-05T01:30:40Z");
        
        //Eu passei o horario de SP
        //mas como ele é configurado para mandar ele retorna horario de Londres
        Instant d07 = Instant.parse("2024-02-05T01:30:40-03:00");

        //serve para fortar a data do jeito q vc quer
        //usando "DateTimeFormatter" para fazer funcionar
        LocalDate d08 = LocalDate.parse("07/02/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("07/02/2024 01:30", fmt2);

        //Usando o of, colocando assim so os numeros
        LocalDate d10 = LocalDate.of(2024, 2, 7);
        LocalDateTime d11 = LocalDateTime.of(2024, 2, 7, 1, 30, 0);
        
        System.out.println("d01: "+d01.toString());
        System.out.println("d02: "+d02.toString());
        System.out.println("d03: "+d03.toString());
        System.out.println("d04: "+d04.toString());
        System.out.println("d05: "+d05.toString());
        System.out.println("d06: "+d06.toString());
        System.out.println("d07: "+d07.toString());
        System.out.println("d08: "+d08.toString());
        System.out.println("d09: "+d09.toString());
        System.out.println("d10: "+d10.toString());
        System.out.println("d11: "+d11.toString());

    //Formatação
        LocalDate d12 = LocalDate.parse("2024-02-07");
        LocalDateTime d13 = LocalDateTime.parse("2024-02-07T01:30:13");
        Instant d14 = Instant.parse("2024-02-07T01:30:13z");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        //se ajusta ao seu horario local 
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d04 = " + d12.format(fmt3));
        System.out.println("d04 = " + fmt3.format(d12));

        System.out.println("d13 = "+ d13.format(fmt3));
        System.out.println("d13 = "+ d13.format(fmt4));

        System.out.println("d14 = "+ fmt5.format(d14));

    }
}
