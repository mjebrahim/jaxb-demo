package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookType", propOrder = {
})
@Getter
@Setter
public class Book {
    @XmlAttribute
    private String id;
    @XmlElement
    private String title;
    @XmlElement
    private String author;
    @XmlElement
    private int year;


    public static void main(String[] args) throws JAXBException {
        Book book = new Book();
        book.setTitle("Book1");
        book.setAuthor("Author1");
        book.setYear(2021);
        book.setId("1");

        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // write it to xml file
        mar.marshal(book, System.out);
        mar.marshal(book, new File("bookElOne.xml"));


        // unmarshal
        Unmarshaller un = context.createUnmarshaller();
        Book book1 = (Book) un.unmarshal(new File("bookElOne.xml"));
        System.out.printf("%s %s %d", book1.getTitle(), book1.getAuthor(), book1.getYear());
    }
}