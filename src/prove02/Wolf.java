package prove02;

import java.awt.*;

/**
 * Created by David on 4/28/2017.
 */
public class Wolf extends Creature implements Movable, Aware, Aggressor  {
    public Shape move() {
        return null;
    }

    public void attack(Creature target) {

    }

    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {

    }

    Shape getShape() {
        return null;
    }Color getColor() {
        return null;
    }

    Boolean isAlive() {
        return null;
    }
}
// The Wolf class should be a subclass of Creature and should implement the Movable, Aware, and Aggressor interfaces.
// When the move() function is called on a Wolf instance, it should move in its preferred direction.
// When it is first created, it's preferred direction should be random.
// When the senseNeighbors() function is called, the Wolf instance should change its preferred direction to be in the
// direction of the first Animal instance it sees. When checking for nearby animals, it should first check in the
// direction it's already moving. If no Animal instance is there, it should search in a clockwise pattern starting
// at the top.