package estudo.funcional;

//Anotação para indicar que é uma classe funcional e tem apenas um método abstrato
//Anotação é uma indicação
@FunctionalInterface
public interface Calculadora {
    public int calcular(int x, int y);

    //default void calcular(int x, int y, int z);

}
