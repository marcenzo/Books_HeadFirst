package br.com.headfirstjava.chapter10;

class Songs
{
    public String title;
    
    public Songs(String t){
	title = t;
    }
    
    public void play() {
	Sound song = new Sound();
	song.playerMusic(title);
    }
}

class Sound
{
    public void playerMusic(String title)
    {
	System.out.println("ColdPlay");
    }
    
}  

public class MusicPlayerTestDrive
{
    public static void main(String[] args)
    {
	
	Sound song1 = new Sound();
	
	song1.playerMusic("");
	
	
	
	
    }
    
}
