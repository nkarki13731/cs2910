public class Book {
    //Exercise 3a
    //All data must be encapsulated as private.

    //All books have a title, author and id
    private String title;
    private String author;
    private int id;
    private Boolean borrowed;
    private Client client;

    public Book(String title,String author,int id,Boolean borrowed,Client client){
        this.title = title;
        this.author = author;
        this.id = id;
        this.borrowed = borrowed;
        this.client = client;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        if(!title.isEmpty()){
            this.title = title;}
        else{
            System.out.println("Invalid title");
        }
    }
    //All books must have a status of whether they are borrowed or not
    //All books need a reference to whom it is borrowed
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        if(!author.isEmpty()){
            this.author = author;}
        else{
            System.out.println("Invalid Author Name");
        }
    }

    public int getId(){
        return this.id;

    }

    public void setId(int id){
        if(id >= 1){
            this.id = id;
        }
        else {
            System.out.println("Invlaid Id");
        }
    }
}
