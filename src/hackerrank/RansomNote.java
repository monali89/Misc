package practice;

import java.util.HashMap;

public class RansomNote {
	
	static void checkMagazine(String[] magazine, String[] note) {
		
		
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		HashMap<String, Integer> n = new HashMap<String, Integer>();
		
		
	}
	
static void checkMagazine2(String[] magazine, String[] note) {
        
        HashMap<String, Integer> mag = new HashMap<String, Integer>();
        HashMap<String, Integer> nt = new HashMap<String, Integer>();
        
        for(int i=0; i<note.length; i++){
            if(nt.containsKey(note[i])){
                int count = nt.get(note[i]);
                nt.put(note[i],(Integer)count+1);
            }else{
                nt.putIfAbsent(note[i], (Integer)1);
            }            
        }
        
        for(int i=0; i<magazine.length; i++){
            if(mag.containsKey(magazine[i])){
                int count = mag.get(magazine[i]);
                mag.put(magazine[i],(Integer)count+1);
            }else{
                mag.putIfAbsent(magazine[i], (Integer)1);
            }            
        }
        
        System.out.println("mag: " + mag.toString());
        System.out.println("nt: " + nt.toString());
        
        boolean status = true;
        for(String word: nt.keySet()){
            if(mag.containsKey(word)){
               if(nt.get(word) > mag.get(word)){
                    status = false;
                } 
            }else{
                status = false;
            }
        }
        if(status){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] magazine = {"apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo", "apgo", "w", "elo", "bg"};
			// {"two", "times", "three", "is", "not", "four"};
		String[] note = {"elo", "lxkvg", "bg", "mwz", "clm", "w"};
			//{"two", "times", "two", "is", "four"};
		
		checkMagazine2(magazine, note);

	}

}
