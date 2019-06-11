public class Facade {

    public void tests(){
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ModuleC moduleC = new ModuleC();

        moduleA.testA();
        moduleB.testB();
        moduleC.testC();
    }
}
