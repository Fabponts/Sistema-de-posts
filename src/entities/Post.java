package entities;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private String title;
    private String content;
    private Integer likes;
    private LocalDateTime moment;

    //Associaçoes:
    private List<Comment> comments = new ArrayList<>();

    //Constructors
    public Post(){
    }
    public Post(String title, String content, Integer likes, LocalDateTime moment) {
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public List<Comment> getComments() {
        return comments;

    }

    //Methods
    public void addComment(Comment comment){
        if (comment == null || comment.getText()==null){
            System.out.println("You should put a comment");
            return;
        }
        comments.add(comment);
    }
    public void removeComment(Comment comment){
        comments.remove(comment);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(content + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(dt1.format(moment) + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments){
            sb.append((c.getText()) + "\n");
        }
        return sb.toString();
    }
}
