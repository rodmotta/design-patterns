package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        // Creating a blog
        Blog blog = new TechBlog();
        // Creating observers
        Observer rod = new Reader("Rodrigo");
        Observer edu = new Reader("Maria");
        // Adding observers to the blog
        blog.addObserver(rod);
        blog.addObserver(edu);
        // Notifying observers about a new blog article
        blog.publishArticle("Web Application Development with Spring Boot!");
        // Removing an observer
        blog.removeObserver(rod);
        // Notifying observers again about a new blog article
        blog.publishArticle("Software design patterns explained!");
    }
}
