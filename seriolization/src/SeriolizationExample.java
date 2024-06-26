import java.io.*;

public class SeriolizationExample {

    public static void serializeObject(Object object) {
        try(OutputStream outputStream = new FileOutputStream("Person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(object);
        }
        catch (IOException ex){
            System.err.println(ex);
        }

    }

    public static Object deSerializeObject(String filename){
        try(InputStream inputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return objectInputStream.readObject();
        }
        catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        Person person = new Person("John","Delhi",45);

        serializeObject(person);

        Person Person = (Person) deSerializeObject("Person.ser");
        System.out.println(person);

    }

}