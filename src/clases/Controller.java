package clases;

import helper.DataRegister;
import helper.Print;

import java.io.PrintStream;

public class Controller {
    Lambdas lambdas;

    public Controller() {
        this.lambdas = new Lambdas();
    }

    public void run() {
        Print.printDescription1(lambdas.search(DataRegister.getListExercise1()));
        Print.printDescription2(lambdas.getString(DataRegister.getListExercise2()));
        Print.printDescription3(lambdas.getString3(DataRegister.getListExercise3()));
        Print.printDescription4();lambdas.getListWordOddLength(DataRegister.getListExercise4());
        Print.printDescription5();lambdas.getListWordUpperCase(DataRegister.getListExercise5());
        Print.printDescription6(lambdas.getLStringMap(DataRegister.getListExercise6()));
        Print.printDescription6();lambdas.threadPrintNL(DataRegister.getListExercise7(), new PrintStream(System.out));
    }
}