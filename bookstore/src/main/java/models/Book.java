package models;

public class Book {

  private String title;
  private String author;
  private String price;
  private String image;

  public Book(String title,
              String author,
              String price,
              String image) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.image = image;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getPrice() {
    return price;
  }

  public String getImage() {
    return image;
  }
}
