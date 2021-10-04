package hira;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;
    
    Cricket(String matchType,int over,Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player=player;
    }
    
    void display()
    {
        System.out.println("Match Type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+player.playerName);
        System.out.println("Jersey Number: "+player.jerseyNumber);
        
    }
    
}

/*

Name: Md. Mahdi Hossain Hira
ID: 2012020106
Section: C
Email: cse_2012020106@lus.ac.bd
Date: 09/09/2021

*/