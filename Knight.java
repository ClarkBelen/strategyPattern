public class Knight implements CharacterType{
    public void attack(){
        System.out.print("Knight ");
        new SwingSword().useAttackStrategy();
        
    }
    public void defend(){
        System.out.print("Knight ");
        new ShieldDefense().useDefendStrategy();
        

        System.out.print("Knight ");
        new DodgeDefense().useDefendStrategy();
        

        System.out.print("Knight ");
        new MagicDefense().useDefendStrategy();
        
    }
}
