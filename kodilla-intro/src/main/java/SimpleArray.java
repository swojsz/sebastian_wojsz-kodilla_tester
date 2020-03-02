public class SimpleArray {
    public static void main(String[] args) {
        String[] songs = new String[5];
        int numberOfElements = songs.length;

        songs[0] = "Fade to black";
        songs[1] = "Zok Zok";
        songs[2] = "Smak 80 lat";
        songs[3] = "MIRO MARO";
        songs[4] = "Kamień z napisem love";

        String song = songs[3];
        System.out.println(song);
        System.out.println("Moja tablica ma");
        System.out.println(songs.length);
    }
}