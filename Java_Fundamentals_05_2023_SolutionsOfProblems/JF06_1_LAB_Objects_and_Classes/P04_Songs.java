package JF06_1_LAB_Objects_and_Classes;

import java.util.*;

public class P04_Songs {
 public static class Song{
    private String type;
    private String name;
    private String time;
public Song(String type,String name,String time){
    this.type=type;
    this.name=name;
    this.time=time;
}

     public String getType() {
         return this.type;
     }

     public String getName() {
         return this.name;
     }
 }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSongs=Integer.parseInt(scanner.nextLine());
        List<Song> songsList= new ArrayList<>();


        for (int i = 0; i <numberSongs ; i++) {
            String[] lineData=scanner.nextLine().split("_");
            Song nextSong=new Song(lineData[0],lineData[1],lineData[2]);
            songsList.add(nextSong);
        }

        String command=scanner.nextLine();
        for (Song song : songsList) {
            if(command.equals("all")||command.equals(song.getType())){
                System.out.println(song.getName());
            }
        }
    }
}
