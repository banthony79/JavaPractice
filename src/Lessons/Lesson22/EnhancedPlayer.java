package Lessons.Lesson22;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;


    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.health = health;
        this.weapon = weapon;
    }
}
