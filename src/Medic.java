public class Medic extends Hero implements HavingSuperAbility {
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил массовое лечение");
    }

    double healPoints=10;
    void increaseExperience() {
        healPoints*=1.1;
        System.out.println("Medic healPoints = "+healPoints);
    }
}
