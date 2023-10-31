public class Prog_18SimpleCalculator {

        double firstNumber;
        double secondNUmber;

        public double getFirstNumber(){
            return this.firstNumber;
        }
        public double getSecondNUmber(){
            return this.secondNUmber;
        }
        public void setFirstNumber(double fN){
            this.firstNumber = fN;
        }
        public void setSecondNumber(double sN){
            this.secondNUmber = sN;
        }
        public double getAdditionResult(){return (this.firstNumber + this.secondNUmber);
        }
        public double getSubtractionResult(){
            return (this.firstNumber - this.secondNUmber);
        }
        public double getMultiplicationResult(){
            return (this.firstNumber * this.secondNUmber);
        }
        public double getDivisionResult() {
            if (this.secondNUmber != 0) {
                return (this.firstNumber + this.secondNUmber);
            }
            return 0;
        }

        public static void main(String[] args) {
            Prog_18SimpleCalculator calculator = new Prog_18SimpleCalculator();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);
            System.out.println("add= " + calculator.getAdditionResult());
            System.out.println("subtract= " + calculator.getSubtractionResult());
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);
            System.out.println("multiply= " + calculator.getMultiplicationResult());
            System.out.println("divide= " + calculator.getDivisionResult());
        }

    }
