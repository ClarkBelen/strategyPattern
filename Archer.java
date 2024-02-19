public class Archer implements CharacterType{

    @Override
    public void attack() {
        System.out.print("Archer ");
        new ShootArrow().useAttackStrategy();
    }

    @Override
    public void defend() {
        System.out.print("Archer ");
        new DodgeDefense().useDefendStrategy();
    }
    
}
