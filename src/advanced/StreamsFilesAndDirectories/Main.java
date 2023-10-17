package advanced.StreamsFilesAndDirectories;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 15.3;
        cube.height =12.4;
        cube.depth =3.0;
        String path = "output6.txt";
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(cube);

        }
        ObjectInputStream objectInputStream = new ObjectInputStream((new FileInputStream(path)));
        Cube cube1 = (Cube) objectInputStream.readObject();
        System.out.println();


    }

}
