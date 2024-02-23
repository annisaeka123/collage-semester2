/**
 * DragonMain03
 */
public class DragonMain03 {

    public static void main(String[] args) {
        Dragon03 dragon = new Dragon03(0, 0, 10, 10);
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveLeft();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();


        
 
    }
}