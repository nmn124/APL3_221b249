public class Main {
    public static void main(String[] args) {
    
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();


        arjun.fight(); 
        ((Pandav) arjun).obey(); 
        ((Pandav) arjun).kind();

        bheem.fight(); 
        ((Pandav) bheem).obey(); 
        ((Pandav) bheem).kind(); 
        
        duryodhan.fight(); 
        ((Kaurav) duryodhan).disobey(); 
        ((Kaurav) duryodhan).cruel(); 

        vikarn.fight(); 
        ((Kaurav) vikarn).disobey(); 
        ((Kaurav) vikarn).cruel(); 
    }
}
