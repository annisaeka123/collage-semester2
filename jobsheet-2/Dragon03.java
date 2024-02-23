/**
 * Dragon03
 */
public class Dragon03 {

    int x, y, width, height;
    
    public Dragon03(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    
    void moveLeft(){
        if (x >= 0) {
            x--;
        }
    }

    void moveRight(){
        if (x <= width) {
            x++;
        }
    }

    void moveUp(){
        if (y >= 0) {
            y--;
        }
    }

    void moveDown(){
        if (y <= height) {
            y++;
        }
    }

    void printPosition(){
        if (x >= 0 && x <= width && y >= 0 && y <= height){
            System.out.println("Position: (" + x + ", " + y + ")");
        } else {
            detectCollision(x, y);
        }
    }

    void detectCollision(int x, int y){
        System.out.println("GAME OVER!");
    }



}
