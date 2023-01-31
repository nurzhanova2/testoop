package sports.management;

public class Player {
    private String name;
    private int age;
    private String skillLevel;

    public Player(String name, int age, String skillLevel) {
        this.name = name;
        this.age = age;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
    public void addPlayer(Player player) {
        // Code to add player to a database or collection
    }

    public void updatePlayer(Player player) {
        // Code to update player in a database or collection
    }

    public void deletePlayer(Player player) {
        // Code to delete player from a database or collection
    }
}

