package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entites.Comment;
import entites.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post(sdf.parse("16/08/2024 16:46:28"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}
}
