
package org.example.generated;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.*;
import org.example.Book;

import java.io.File;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookType", propOrder = {
    "author",
    "title",
    "year"
})
@XmlRootElement(name = "book")
public class BookType {

    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String year;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public static void main(String[] args) throws JAXBException {
        BookType book = new BookType();
        book.setTitle("BookType1");
        book.setAuthor("Author1");
        book.setYear("2021");
        book.setId("1");

        JAXBContext context = JAXBContext.newInstance(BookType.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // write it to xml file
        mar.marshal(book, System.out);
        mar.marshal(book, new File("bookElOne.xml"));


        // unmarshal
        Unmarshaller un = context.createUnmarshaller();
        BookType book1 = (BookType) un.unmarshal(new File("bookElOne.xml"));
        System.out.printf("%s %s %s", book1.getTitle(), book1.getAuthor(), book1.getYear());
    }
}
