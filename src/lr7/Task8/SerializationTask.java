package lr7.Task8;


import java.io.*;

public class SerializationTask {
    public static void main(String[] args) {
        Cat myCat = new Cat("Neki", "white");
        Cat myCatDeseializated = new Cat(null, null);

        try {
            FileOutputStream fileOut = new FileOutputStream("src/lr7/Task8/mycat.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myCat);
            fileOut.close();
            System.out.println("Serialized data is saved in mycat.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("src/lr7/Task8/mycat.ser");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            myCatDeseializated = (Cat) in.readObject();
            fileInputStream.close();
            System.out.println("Deserialized data is saved in myCatDeseializated object");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Deserialized object: Cat(" + myCatDeseializated.getName() + ", " + myCatDeseializated.getColor() + ")");
    }
}
