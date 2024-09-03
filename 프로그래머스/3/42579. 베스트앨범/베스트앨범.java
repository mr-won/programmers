import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

class Solution {
    	static LinkedList<Song> songList;

	static LinkedList<Integer> AlbumId;
    
	static HashMap<String, Integer> genreMap;
    
	static HashMap<String, Integer> albumMap;
    
	
    public int[] solution(String[] genres, int[] plays) {
       
        
        songList = new LinkedList<Song>();
        
        AlbumId = new LinkedList<Integer>();
        
        genreMap = new HashMap<String, Integer>();
        
        albumMap = new HashMap<String, Integer>();
        
        for(int i = 0; i < plays.length; i++) {
        	int id = i;
        	int play = plays[i];
        	String genre = genres[i];
        	
        	songList.add(new Song(id, play, genre));
        	
        	if(!genreMap.containsKey(genre)) {
        		genreMap.put(genre, play);
        	}else {
        		genreMap.put(genre, genreMap.get(genre) + play);
        	}
        	
        }
        
         
        Collections.sort(songList, new Comparator<Song>() {

			@Override
			public int compare(Song o1, Song o2) {
				if(o1.genre.equals(o2.genre)) {
					return o1.compareTo(o2);
				}else {
					return genreMap.get(o2.genre) - genreMap.get(o1.genre);
				}
				
			}
			
		});
        
        
        for(Song song : songList){
            if(!albumMap.containsKey(song.genre)){
                albumMap.put(song.genre, 1);
                AlbumId.add(song.id);
            } else {
                int genreCnt = albumMap.get(song.genre);
                
                if(genreCnt >= 2) continue;
                else {
                    albumMap.put(song.genre, genreCnt + 1);
                    AlbumId.add(song.id);
                }
            }
        }
        
        int[] answer = new int[AlbumId.size()];
        for(int i = 0 ; i < answer.length ; ++i){
            answer[i] = AlbumId.get(i);
        }
        
        return answer;
    }
}


class Song implements Comparable<Song>{
	int id;
	int play;
	String genre;
	
	public Song(int id, int play, String genre) {
		this.id = id;
		this.play = play;
		this.genre = genre;
	}
	public int compareTo(Song o) {
		if(this.play == o.play) return this.id - o.id; 
		else return o.play - this.play;
	}
	
	
}