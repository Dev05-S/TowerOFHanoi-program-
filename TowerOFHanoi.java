class TOH{
    public static void toh(int n , char BEG, char AUX, char END){
        if(n>=1){
            toh(n-1,BEG,END,AUX);
            System.out.println(BEG + " to " +  END);
            toh(n-1,AUX,BEG,END);
        }
    }
}


public class TowerOFHanoi {
    public static void main(String[] args) {
        TOH.toh(3,'A','B','C');
    }
}
