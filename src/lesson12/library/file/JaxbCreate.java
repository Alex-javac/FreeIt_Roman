package lesson12.library.file;

import lesson12.library.lib.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Path;

public class JaxbCreate {

    public static void bookMarshalling(Book book) {
        try ( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson12/library/file/book"+book.getId()+".xml")))
        {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(book, bufferedWriter);


        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Book bookUnmarshalling(Path file) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(file)));) {

            JAXBContext context = JAXBContext.newInstance(Book.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Book) unmarshaller.unmarshal(bufferedReader);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
