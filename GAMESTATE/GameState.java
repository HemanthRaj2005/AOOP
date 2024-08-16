public class GameState {
    private static GameState instance;
    private static final Object lock = new Object();
    private int level;
    private String difficulty;

    private GameState() {
        this.level = 1;
        this.difficulty = "Easy";
    }

    public static GameState getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new GameState();
                }
            }
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }

    public synchronized void setLevel(int level) {
        if (level > 0) {
            this.level = level;
        } else {
            throw new IllegalArgumentException("Level must be positive.");
        }
    }

    public String getDifficulty() {
        return difficulty;
    }

    public synchronized void setDifficulty(String difficulty) {
        if (difficulty != null && !difficulty.isEmpty()) {
            this.difficulty = difficulty;
        } else {
            throw new IllegalArgumentException("Difficulty cannot be null or empty.");
        }
    }

    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        System.out.println("Initial Level: " + gameState.getLevel());
        System.out.println("Initial Difficulty: " + gameState.getDifficulty());

        gameState.setLevel(2);
        gameState.setDifficulty("Hard");
        System.out.println("Updated Level: " + gameState.getLevel());
        System.out.println("Updated Difficulty: " + gameState.getDifficulty());

        // Testing Enemy creation
        EnemyFactory enemyFactory = new HardEnemyFactory();
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        // Testing Game Item creation
        GameItemFactory itemFactory = new HardGameItemFactory();
        Weapon weapon = itemFactory.createWeapon();
        PowerUp powerUp = itemFactory.createPowerUp();
        weapon.use();
        powerUp.activate();
    }
}

// Enemy interface
interface Enemy {
    void attack();
}

// Concrete Enemy classes
class EasyEnemy implements Enemy {
    public void attack() {
        System.out.println("Easy Enemy attacks!");
    }
}

class HardEnemy implements Enemy {
    public void attack() {
        System.out.println("Hard Enemy attacks!");
    }
}

// Enemy Factory
abstract class EnemyFactory {
    public abstract Enemy createEnemy();
}

class EasyEnemyFactory extends EnemyFactory {
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}

class HardEnemyFactory extends EnemyFactory {
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}

// Weapon interface
interface Weapon {
    void use();
}

// PowerUp interface
interface PowerUp {
    void activate();
}

// Concrete Weapon and PowerUp classes
class EasyWeapon implements Weapon {
    public void use() {
        System.out.println("Using easy weapon!");
    }
}

class HardWeapon implements Weapon {
    public void use() {
        System.out.println("Using hard weapon!");
    }
}

class EasyPowerUp implements PowerUp {
    public void activate() {
        System.out.println("Activating easy power-up!");
    }
}

class HardPowerUp implements PowerUp {
    public void activate() {
        System.out.println("Activating hard power-up!");
    }
}

// Abstract Factory for creating families of related objects
interface GameItemFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}

class EasyGameItemFactory implements GameItemFactory {
    public Weapon createWeapon() {
        return new EasyWeapon();
    }
    
    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}

class HardGameItemFactory implements GameItemFactory {
    public Weapon createWeapon() {
        return new HardWeapon();
    }
    
    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}
