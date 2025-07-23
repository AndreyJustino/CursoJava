import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dateTimePostTravel = LocalDateTime.of(2018, 6, 21, 13, 05, 44);

        Post postTravel = new Post(
                dateTimePostTravel,
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        Comment commentPostTravel1 = new Comment("Have a nice trip");
        Comment commentPostTravel2 = new Comment("Wow that's awesome!");

        postTravel.addComment(commentPostTravel1);
        postTravel.addComment(commentPostTravel2);

        //=======================================================================================

        LocalDateTime dateTimePostGoodNight = LocalDateTime.of(2018, 7, 28, 23, 14,19);

        Post postGoodNight = new Post(
                dateTimePostGoodNight,
                "Good night guys",
                "See you tomorrow",
                5);

        Comment commentPostGoodNight1 = new Comment("Good night");
        Comment commentPostGoodNight2 = new Comment("May the Force be with you");

        postGoodNight.addComment(commentPostGoodNight1);
        postGoodNight.addComment(commentPostGoodNight2);

        //=======================================================================================

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(postTravel.getTitle());
        System.out.printf("%d Likes - %s \n", postTravel.getLikes(), postTravel.getMoment().format(formatter));
        System.out.println(postTravel.getContent());
        System.out.println("Comments:");
        for (String value : postTravel.allComments()){
            System.out.println(value);
        }

        System.out.println("");

        System.out.println(postGoodNight.getTitle());
        System.out.printf("%d Likes - %s \n", postGoodNight.getLikes(), postGoodNight.getMoment().format(formatter));
        System.out.println(postGoodNight.getContent());
        System.out.println("Comments:");
        for (String value : postGoodNight.allComments()){
            System.out.println(value);
        }

    }
}