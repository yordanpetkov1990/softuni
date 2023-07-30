package fundamentals.ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    String typeList;
    String name;
    String time;
    public Song(String typeList,String name,String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();
        for(int i =0;i<n;i++){
            String[] arr = scan.nextLine().split("_");
            String typeList = arr[0];
            String name = arr[1];
            String time = arr[2];

            Song currentSong = new Song(typeList,name,time);
            songs.add(currentSong);
        }
        String command = scan.nextLine();
        if(command.equals("all")){
            for(Song song:songs){
                System.out.println(song.name);
            }
        }
        else{
            for(Song song:songs){
                if(song.typeList.equals(command)){
                    System.out.println(song.name);
                }
            }
        }
    }
}
