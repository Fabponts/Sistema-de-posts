package entities;
import java.time.LocalDate;

public class Comment {
   private String text;

   //Constructors
   public Comment(){
   }

   public Comment(String text){
       this.text = text;
   }

   public String getText(){
      return this.text = text;
   }
   public void setText(String text){
       this.text=text;
   }
}
