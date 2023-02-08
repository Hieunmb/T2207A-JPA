package practicalexam;

public class Book {
    public String tilte;
    public Author name;
    public double price;

    public Book(String tilte, Author name, double price) {
        this.tilte = tilte;
        this.name = name;
        this.price = price;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public Author getName() {
        return name;
    }

    public void setName(Author name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return this.tilte+" "+this.name+" "+this.price;
    }
}
