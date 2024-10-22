import java.util.Map;
import java.util.HashMap;
import greenfoot.*;

public class HighScore extends World {

    private Map<String, Integer> highScores;
    private Menu menuScreen;
    private Label goBackButton;

    public HighScore(Menu menuScreen) 
    {
        super(600, 400, 1);
        this.menuScreen = menuScreen;
        highScores = new HashMap<>();
        loadScores();
        displayScores();

        goBackButton = new Label("To Menu", 25);
        
        addObject(new Button(this::goBack), 300, 350);
        addObject(goBackButton, 300, 350);
    }

    private void loadScores() 
    {
        highScores.put("Jamie", 100);
        highScores.put("Zia", 80);
        highScores.put("Donquavious", 90);
    }

    private void displayScores() 
    {
        int y = 100;

        for (Map.Entry<String, Integer> entry : highScores.entrySet())
         {
            Label scoreLabel = new Label(entry.getKey() + ": " + entry.getValue(), 24);
            addObject(scoreLabel, 300, y);
            y += 50;
        }

    }

    public void goBack() 
    {
        Greenfoot.setWorld(menuScreen);
    }
}