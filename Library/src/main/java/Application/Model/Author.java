package Application.Model;

import java.util.Objects;

/**
 * This class is used to model an Author.
 * Do not modify anything in this class.
 */
public class Author {
    public static String author_id;
    int id;
    String name;
    /**
     * A default, no-args constructor is REQUIRED for Jackson ObjectMapper to work.
     */
    public Author(){

    }

    public Author(String name) {
        this.name = name;
    }

    /**
     * An all-args constructor for creating new Author objects in DAO and service classes.
     * @param id
     * @param name
     */
    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * An equals method that determines if another Author is equal to this one.
     * This was auto-generated by the IDE (alt+insert).
     * Do not change anything in this method.
     * @param o some other object (such as Author).
     * @return true if this author is equivalent to o, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && Objects.equals(name, author.name);
    }
    /**
     * A toString method in the event that you want to test your methods using System.out.println.
     * This was auto-generated by the IDE (alt+insert).
     * @return a String representation of this flight.
     */
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
