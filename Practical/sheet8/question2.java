/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;


class LibraryItem {
    private int itemId;
    private String title;
    private int publicationYear;

    public LibraryItem(int itemId, String title, int publicationYear) {
        this.itemId = itemId;
        this.title = title;
        this.publicationYear = publicationYear;
    }
    
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    public double calcLateFee(int days) {
        return 5.0 * days;
    }
    
    public double calcLateFee(int days, int dis) {
        return calcLateFee(days)  - dis / 100 * calcLateFee(days);
    }

    @Override
    public String toString() {
        return "Data{" + "itemId=" + itemId + ", title=" + title + ", publicationYear=" + publicationYear + '}';
    }
    
    public void displayDetails() {
        System.out.println(toString());
    }
    
    
    
}

class PrintedBook extends LibraryItem {
    private String author;
    private int numOfPages;

    public PrintedBook(String author, int numOfPages, int itemId, String title, int publicationYear) {
        super(itemId, title, publicationYear);
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public void displayDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "DigitalResource{" + "itemId=" + super.getTitle() + ", title=" + super.getTitle() + ", publicationYear=" + super.getPublicationYear() + "author: " + author + "numOfPages: " + numOfPages + '}';
    }

    @Override
    public double calcLateFee(int days) {
        return super.calcLateFee(days); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

class DigitalResource extends LibraryItem { 
    private String fileFormat; 
    private double fileSize; 

    public DigitalResource(double fileSize, int itemId, String title, int publicationYear, String fileFormat) {
        super(itemId, title, publicationYear);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "DigitalResource{" + "itemId=" + super.getTitle() + ", title=" + super.getTitle() + ", publicationYear=" + super.getPublicationYear() + "fileSize: " + fileSize + "fileFormat: " + fileFormat + '}';
    }
    
   
}


public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
 
        // TODO 9: Create one object of each child class. 
        PrintedBook pb = new PrintedBook("Noorelden", 200, 54, "hdh", 1816);
        DigitalResource d = new DigitalResource(34.5, 20, "IMG", 1943, "JPG");
        
        // TODO 10: Display their information. 
        System.out.println(pb);
        System.out.println(d);
        // TODO 11: Calculate their late fees for 5 days. 
        System.out.println("Late fee for book: " + pb.calcLateFee(5));
        System.out.println("Late fee for digital: " + d.calcLateFee(5));
        // TODO 12: Test the overloaded method. 
        pb.displayDetails();
        d.displayDetails();
        // TODO 13: Print both objects using System.out.println(). 
        
        // TODO 14: Create a LibraryItem reference 
        LibraryItem I = new PrintedBook("Noorelden", 200, 54, "hdh", 1816);
        // pointing to a PrintedBook object and call calculateLateFee(). 
        System.out.println("Library item late fee: " + I.calcLateFee(5));
    }
}
