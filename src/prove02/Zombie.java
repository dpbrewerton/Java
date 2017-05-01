package prove02;

import java.awt.Color;
import java.util.Random;

/**
 * Created by David on 4/28/2017.
 */
public class Zombie extends Creature implements Movable, Aggressor {
    Random _rand;

    public Zombie() {
        _rand = new Random();
        _health = 1;
    }

    public Shape move() {
        switch(_rand.nextInt(2)) {
            case 0:
                _location.x++;
                break;
            case 1:
                _location.x--;
                break;
            default:
                break;
        }
        return null;
    }

    public void attack(Creature target) {
            if(target instanceof Animal) {
                target.takeDamage(10);
            }
    }

    public Shape getShape() {
            return Shape.Square;
        }

    public Color getColor() {
            return new Color(0, 0, 165);
        }

    public Boolean isAlive() {
            return _health > 0;
    }
}
// implements > interfaces, many. Must use all methods from it.
// extends > subclass - 1
// The Zombie class should be a subclass of Creature and should implement the Movable and Aggressor interfaces.
// Instances of the Zombie class should always move from left to right.
// Instances of the Zombie class should attack any creature they land on,
// as long as it isn't an instance of the Plant class. They should inflict 10 points of damage when they attack.
// Instances of the Zombie class should be represented as blue squares.
// Modify the Game class to add 10 Zombie instances to the List of Creature objects created at the start of the simulation.
