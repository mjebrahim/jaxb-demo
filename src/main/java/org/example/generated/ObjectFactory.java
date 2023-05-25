
package org.example.generated;


import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Book_QNAME = new QName("", "book");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookType }
     * 
     */
    public BookType createBookType() {
        return new BookType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "book")
    public JAXBElement<BookType> createBook(BookType value) {
        return new JAXBElement<BookType>(_Book_QNAME, BookType.class, null, value);
    }

}
