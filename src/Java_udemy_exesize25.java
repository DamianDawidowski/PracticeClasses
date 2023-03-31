public class Java_udemy_exesize25 {
    public static void main(String[] args) {
        System.out.print(canPack(3, 2, -12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int totalWeight = (bigCount * 5) + smallCount;

        //      int currentbigCount = 0;
        int currentbigWeight = bigCount * 5;
        if ((bigCount<0) || (smallCount<0) || (goal<0))
        {
            return false;
        }
       else if (totalWeight < goal) {
            return false;
        } else if (totalWeight == goal) {
            return true;
        } else if (((currentbigWeight > goal) && ((goal%5)<= smallCount))) {
    //        if ((currentbigWeight - goal) >= smallCount) {
                return true;
            }
        else if (((currentbigWeight < goal) && ((totalWeight-goal)<= smallCount)))
        {
            return true;
        }
        else {
                return false;
            }
        }
    }

