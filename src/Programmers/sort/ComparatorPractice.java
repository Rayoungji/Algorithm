package Programmers.sort;

import java.util.*;

public class ComparatorPractice {

    static class Song {

        private int id;
        private String name;

        public Song(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

    }

    public static void main(String args[]) {
        Song song = new Song(5, "hi");
        Song song2 = new Song(3, "hello");
        Song song3 = new Song(1, "haha");
        Song song4 = new Song(7, "hoho");

        List<Song> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);

        //오름차순정렬
        Collections.sort(songs, (o1, o2) -> {
            if (o2.getId() > o1.getId()) {
                return -1;
            }
            return 0;
        });

        songs.stream().forEach(i -> {
            System.out.println(i.getId());
        });

    }
}
