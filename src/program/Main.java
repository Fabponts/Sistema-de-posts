package program;
import entities.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Welcome to Fabitt-------");

        Comment c1 = new Comment("That was a terrible match ");
        Comment c2 = new Comment("Out Paiva, Bring my botafogo back");
        DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("21/06/2018 13:05:44",dt1);
        Post p1 = new Post("Botafogo lost against Entudiantes de la Plata","The match was terrible and the" +
                " goalkepper John made a bizarre mistake ",12,localDateTime);
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);
    }
}