import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadRoomFile {

    public ArrayList<Rooms> readFile() {
        ArrayList<Rooms> roomsList = new ArrayList<>();
        try {
            FileInputStream fileStream = new FileInputStream("RoomsFile.txt");

            // Creates an ObjectInputStream
            ObjectInputStream input = new ObjectInputStream(fileStream);

            // Reads the objects
            Rooms room1 = (Rooms) input.readObject();
            Rooms room2 = (Rooms) input.readObject();
            Rooms room3 = (Rooms) input.readObject();
            Rooms room4 = (Rooms) input.readObject();
            Rooms room5 = (Rooms) input.readObject();
            Rooms room6 = (Rooms) input.readObject();
            input.close();

            roomsList.add(room1);
            roomsList.add(room2);
            roomsList.add(room3);
            roomsList.add(room4);
            roomsList.add(room5);
            roomsList.add(room6);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return roomsList;
    }
}
