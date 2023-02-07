public abstract class Story {
  public static final int MIN_PAGES_NOVEL = 100;
  public static final int MIN_PAGES_NOVELLA = 50;
  public static final int MAX_PAGES_NOVELLA = 100;
  public static final int MAX_PAGES_SHORT_STORY = 50;

  private String title;
  private String author;
  private int pages;
  private String message;

  public Story(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public abstract void setPages(int pages);

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getPages() {
    return pages;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

public class Novel extends Story {
  public Novel(String title, String author) {
    super(title, author);
  }

  @Override
  public void setPages(int pages) {
    if (pages < MIN_PAGES_NOVEL) {
      setMessage(String.format("Minimum page count for a novel is %d pages, add %d pages.", MIN_PAGES_NOVEL, MIN_PAGES_NOVEL - pages));
    }
    this.pages = pages;
  }
}

public class Novella extends Story {
  public Novella(String title, String author) {
    super(title, author);
  }

  @Override
  public void setPages(int pages) {
    if (pages < MIN_PAGES_NOVELLA) {
      setMessage(String.format("Minimum page count for a novella is %d pages, add %d pages.", MIN_PAGES_NOVELLA, MIN_PAGES_NOVELLA - pages));
    } else if (pages > MAX_PAGES_NOVELLA) {
      setMessage(String.format("Maximum page count for a novella is %d pages, cut %d pages.", MAX_PAGES_NOVELLA, pages - MAX_PAGES_NOVELLA));
    }
    this.pages = pages;
  }
}

public class ShortStory extends Story {
  public ShortStory(String title, String author) {
    super(title, author);
  }

  @Override
  public void setPages(int pages) {
    if (pages > MAX_PAGES_SHORT_STORY) {
      setMessage(String.format("Maximum page count for a short story is %d pages, cut %d pages.", MAX_PAGES_SHORT_STORY, pages - MAX_PAGES_SHORT_STORY));
    }
    this.pages = pages;
  }
}
