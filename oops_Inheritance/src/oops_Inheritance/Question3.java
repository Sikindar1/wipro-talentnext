package oops_Inheritance;
class Author{
	private String name,email;
	private char gender;
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String toString() {
		return name+" "+email+" "+gender;
	}
	
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name,Author author,double price,int qtyInStock) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public  void addName(String name) {
		this.name=name;
	}
	public  void addAuthor(Author author) {
		this.author=author;
	}
	public void price(int price) {
		this.price=price;
	}
	public void qtyInStock(int qtyInStock) {
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double price() {
		return  price;
	}
	public int qtyInStock() {
		return qtyInStock;
	}
	public String toString() {
		return name+" "+author+" "+price+" "+qtyInStock;
	}
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author("John","john5@gmail.com",'M');
       Book b=new Book("baba",a,25.0,34);
      System.out.println(b);
	}
}
