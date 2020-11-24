package Programmers.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePractice {

    static class Song implements Comparable<Song> {

        private int id;
        private String name;

        public Song(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        @Override
        public int compareTo(Song o) {
            if (o.getId() < this.getId()) {
                return -1;
            }
            return 0;
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

        //내림차순 정렬
        Collections.sort(songs);

        for (Song i : songs
        ) {
            System.out.println(i.getId());
        }
    }
}

