import java.util.Scanner;

public class StoryDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Story[] stories = new Story[6];
    for (int i = 0; i < stories.length; i++) {
      System.out.print("Enter the story title: ");
      String title = input.nextLine();
      System.out.print("Enter the author name: ");
      String author = input.nextLine();
      System.out.print("Enter the story type (Novel, Novella, ShortStory): ");
      String type = input.nextLine();
      System.out.print("Enter the number of pages: ");
      int pages = input.nextInt();
      input.nextLine();
      switch (type) {
        case "Novel":
          stories[i] = new Novel(title, author, pages);
          break;
        case "Novella":
          stories[i] = new Novella(title, author, pages);
          break;
        case "ShortStory":
          stories[i] = new ShortStory(title, author, pages);
          break;
        default:
          System.out.println("Invalid story type.");
      }
    }
    for (Story story : stories) {
      if (story != null) {
        System.out.println("Title: " + story.getTitle());
        System.out.println("Author: " + story.getAuthor());
        System.out.println("Pages: " + story.getPages());
        if (story.getMessage() != null) {
          System.out.println("Message: " + story.getMessage());
        }
        System.out.println();
      }
    }
  }
}
