// Parminder Singh
// Professor Kanemoto 
// CPSC-39
// 2/2/26
// Book class for my Book objects

public class Book {

    // data variables
    private String name;
    private boolean read;
    private int year; 

    public Book() {
        name = "Unknown";
        read = false;
        year = 1;
    }

    public Book(String name, boolean read, int year) { // parameterized constructor
        this.name = name;
        this.read = read;
        this.year = year;
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public boolean getRead() { 
        return read; 
    }

    public void setRead(boolean read) { 
        // simple guard (optional)
        if (!this.read) {
            this.read = read; 
            this.name = "uninteresting book";
        }
    }

    public int getYear() { 
        return year; 
    }

    public void setYear(int year) { 
        this.year = year; 
    }
    

    @Override
    public String toString() {
    return "Book{name='" + name + "', read=" + read + ", year='" + year + "'}";
    }

    

} // end class