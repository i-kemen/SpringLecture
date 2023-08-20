package di.cal01;

class MyCalculator {
    double firstNum;
    double secondNum;
    Calculator calculator;

    public MyCalculator(double firstNum, double secondNum, Calculator calculator) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.calculator = calculator;
    }

    public void printResult() {
        System.out.println("결과는 " + calculator.calculate(firstNum, secondNum));
    }
}