package nl.novi.tictactoe;

public class Player {
//    Velden
    private String name;
    private String token;
    private int score;

//    Constructor
    public Player(String name, String token){
        this.name = name;
        this.token = token;
        this.score = 0;
    }
//    methods - Getters
    public int getScore(){
        return this.score;
    }
    public String getName(){
        return this.name;
    }
    public String getToken(){
        return this.token;
    }
    //    methods - setters
    public void setScore(int extraPoints){
        score = score + extraPoints;
    }
}
