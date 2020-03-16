package pract6A;

/*import java.util.ArrayList;
import java.util.Locale;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<>();

    public Persoon(String nm,double bud){
        naam=nm;budget=bud;
    }

    public Game zoekGameOpNaam(String naam){
        for(Game game:mijnGames){
            if(game.getNaam()==naam){
                return game;
            }
        }
        return null;
    }
    public double getBudget(){
        return  budget;
    }
    public boolean koop(Game g){
        if(budget >= g.huidigeWaarde()) {
            for(Game mijnGame : mijnGames) {
                if(mijnGame.equals(g)) {
                    return false;
                }
            }
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }else{
            return false;
        }
    }

    public boolean verkoop(Game g,Persoon koper){
        for (Game mijnGame : mijnGames) {
            if(mijnGame.equals(g)) {
                boolean verkocht = koper.koop(g);
                if(verkocht) {
                    mijnGames.remove(g);
                    budget += g.huidigeWaarde();
                }
                return verkocht;
            }
        }
        return false;
    }
    public String toString(){
        String infoString = String.format(Locale.GERMANY, "%s heeft een budget van €%.2f en bezit de volgende games:", naam, budget);
        for(Game game : mijnGames) {
            infoString += "\n" + game;
        }
        return infoString;
    }


}*/
