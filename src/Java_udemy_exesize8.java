public class Java_udemy_exesize8 {
    public static void main(String[] args) {
        System.out.print(hasTeen(2,11,4));
    }

    public static boolean  hasTeen (int par1, int par2, int par3) {

        if ((par1 >=13) && (par1  <=19)) {
            return true;
        }
        else if ((par2 >=13) && (par2  <=19)) {
            return true;
        }
        else if ((par3 >=13) && (par3  <=19)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean  isTeen (int par4) {

        if ((par4 >=13) && (par4  <=19)) {
            return true;
        }

        else {
            return false;
        }
    }



}