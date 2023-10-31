public class Prog_16Point {

        int x;
        int y;

        public Prog_16Point(){
            this.x = 0;
            this.y = 0;
        }

        public Prog_16Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }

        public void setX(int x){
            this.x = x;
        }

        public void setY(int y){
            this.y = y;
        }

        public double distance(){
            return Math.sqrt((this.x-0)*(this.x-0)+(this.y-0)*(this.y-0));
        }

        public double distance(int x1, int y1){
            return Math.sqrt((this.x - x1)* (this.x - x1) + (this.y - y1)* (this.y - y1));
        }

        public double distance(Prog_16Point p){
            return Math.sqrt((this.x - p.x)* (this.x - p.x) + (this.y - p.y)* (this.y - p.y));
        }

        public static void main(String[] args) {
            Prog_16Point first = new Prog_16Point(6, 5);
            Prog_16Point second = new Prog_16Point(3, 1);
            System.out.println("distance(0,0)= " + first.distance());
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2, 2));
            Prog_16Point point16 = new Prog_16Point();
            System.out.println("distance()= " + point16.distance());
        }
    }
