package Example2;

public abstract class CaffeineBeverage {

    /** The template method design pattern is a pattern where
     * An algorithm has a set of fixed steps. The implementation of each step could vary.
     *
     * In the following class,
     * (a) Which method is the algorithm?
     * (b) which steps could vary?
     */

    final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("boiling water");
    }

    void pourInCup(){
        System.out.println("pouring in cup");
    }
}
