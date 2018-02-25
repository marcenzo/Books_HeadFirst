package br.com.headfirstjava.chapter10;

class Song
{
    public String title;
    public Song(String t)
    {
	System.out.println("Output:\n");
	title = t;
    }
    
    public void play()
    {
	SoundPlayer  player = new SoundPlayer();
	player.playSound(title);
    }
}

class SoundPlayer
{
    public String playSound(String t)
    {
	return t;
    }
}

class Code
{
    public void starting()
    {
	
	Song song = new Song("Enzo");
	song.play();
	
	System.out.println(song.title);
    }
}


public class MethodNoStaticTestDrive
{
    public static void main(String[] args)
    {
	Code code = new Code();
	code.starting();
	System.out.println("\nDone!");

    }
    
}
