public class Wizard implements CharacterType{

    @Override
    public void attack() {
        System.out.print("Wizard ");
        new CastSpell().useAttackStrategy();
    }

    @Override
    public void defend() {
        System.out.print("Wizard ");
        new MagicDefense().useDefendStrategy();
    }
    
}
