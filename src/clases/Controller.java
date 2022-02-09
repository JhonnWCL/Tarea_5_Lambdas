package clases;

import helper.DataRegister;
import helper.Print;

import java.io.PrintStream;
import java.util.HashMap;

public class Controller {
    Lambdas lambdas;

    public Controller() {
        this.lambdas = new Lambdas();
    }

    public void run() {
        Print.printDescription1(lambdas.search(DataRegister.getListEjercice1()));
        Print.printDescription2(lambdas.getString(DataRegister.getListEjercice2()));
        Print.printDescription3(lambdas.getString3(DataRegister.getListEjercice3()));
        Print.printDescription4();lambdas.getListWordOddLength(DataRegister.getListEjercice4());
        Print.printDescription5();lambdas.getListWordUpperCase(DataRegister.getListEjercice5());
        Print.printDescription6(lambdas.getLStringMap(DataRegister.getListEjercice6()));
        Print.printDescription6();lambdas.threadPrintNL(DataRegister.getListEjercice7(), new PrintStream(System.out));
    }
}
