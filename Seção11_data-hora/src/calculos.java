import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class calculos {
    public static void main(String[] args) {
        
        LocalDate d01 = LocalDate.parse("2024-02-09");
        LocalDateTime d02 = LocalDateTime.parse("2024-02-09T01:30:40");
        Instant d03 = Instant.parse("2024-02-09T01:30:40z");
        
        //Alterações do dia
        LocalDate SemanaPassadaLocalDate = d01.minusDays(7);
        LocalDate ProximaSemanaLocalDate = d01.plusDays(7);

        System.out.println("SemanaPassadaLocalDate = "+ SemanaPassadaLocalDate);
        System.out.println("ProximaSemanaLocalDate = "+ ProximaSemanaLocalDate);
        
        LocalDateTime SemanaPassadaLocalDateTime = d02.minusDays(7);
        LocalDateTime ProximaSemanaLocalDateTime = d02.plusDays(7);

        System.out.println("SemanaPassadaLocalDateTime = "+ SemanaPassadaLocalDateTime);
        System.out.println("ProximaSemanaLocalDateTime = "+ ProximaSemanaLocalDateTime);

        Instant SemanaPassadaInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant ProximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("SemanaPassadaInstant = "+ SemanaPassadaInstant);
        System.out.println("ProximaSemanaInstant = "+ ProximaSemanaInstant);

        //Comaração de datas
        Duration t1 = Duration.between(SemanaPassadaLocalDate.atTime(0,0), d01.atTime(0,0));
        Duration t2 = Duration.between(SemanaPassadaLocalDateTime, d02);
        Duration t3 = Duration.between(SemanaPassadaInstant, d03);
        Duration t4 = Duration.between(d03, SemanaPassadaInstant);


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
