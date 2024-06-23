//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Hero[] heroes = {new Warrior(), new Medic(), new Magic()};
        for (Hero hero: heroes) {
            if (hero instanceof Medic){
                ((Medic) hero).increaseExperience();
            }
            hero.applySuperAbility();
        }
    }
}