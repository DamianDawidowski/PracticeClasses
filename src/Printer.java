public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;



    public Printer(int tonerLevel, boolean duplex) {
//        this.tonerLevel = (tonerLevel<0 || tonerLevel>100) ? -1 : tonerLevel;
        if (tonerLevel<0 || tonerLevel>100) {
            this.tonerLevel = -1;
        } else  {this.tonerLevel =tonerLevel;}
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount) {
        int tempAmount =tonerLevel + tonerAmount;
        if  (tonerAmount > 0 && tonerAmount <= 100) {
            return  (tempAmount > 0 && tempAmount <= 100) ? tonerLevel=tempAmount : -1;
        } else return -1;
    }
    public int printPages(int pages) {
        int printedNow = 0;
    if (duplex) {
        printedNow+=Math.ceil( (double) pages /2);
        System.out.println("Printer prints in duplex mode");
        } else {
        printedNow=pages;
    }
        pagesPrinted+=printedNow;
    return printedNow;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
