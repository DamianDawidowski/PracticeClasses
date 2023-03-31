public class Java_udemy_exesize3 {

    public static void main(String[] args) {


        printMegaBytesAndKiloBytes(2222);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainingkiloBytes = kiloBytes - megaBytes*1024;
        if (kiloBytes < 0) {
            System.out.print("Invalid Value");
        } else {
            System.out.print(kiloBytes + " KB = " + megaBytes + " MB and " + remainingkiloBytes + " KB");
        }
    }
}



