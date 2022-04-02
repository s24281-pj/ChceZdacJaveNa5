package gamers;

import main.Pair;
import main.Unit;

public class s24281 extends Unit {


    public s24281(String id, Pair<Double, Double> position, double rotate, CollisionModel model) {
        super(id, position, rotate, model);
    }

    @Override
    public void run() {
        this.enableStopOnWall();
        this.enableMovement();
        while (true) {
            this.rotateRight();
            this.forward();
            if(nearestCollision() > 0 && whatIsInRange() == 0){
                this.stopRotate();
            }
            if(whatIsInRange()==3 && this.nearestCollision() < 1)
                this.attackInNextMove();
        }
    }
}
