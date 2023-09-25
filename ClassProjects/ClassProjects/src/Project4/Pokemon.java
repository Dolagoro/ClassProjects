package Project4;
public class Pokemon {

    private String name;
    private String type;
    private int hp;
    private int attack;
    private int defense;

    // def constructor
    public Pokemon() {
    }

    // Overloaded constructor
    public Pokemon(String name, String type, int hp, int attack, int defense) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // toString method
    @Override
    public String toString() {
        return "Pokemon [name=" + name + ", type=" + type + ", hp=" + hp + ", attack=" + attack + ", defense=" + defense + "]";
    }
}
