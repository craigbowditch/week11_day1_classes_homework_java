public class Printer {
    private int paperCount;
    private int toner;

    public Printer(int paperCount, int toner) {
        this.paperCount = paperCount;
        this.toner = toner;
    }

    public int getPaper() {
        return this.paperCount;
    }

    public void print(int copies, int pages) {
        int totalCopies = copies * pages;
        if (this.paperCount >= totalCopies) {
            this.paperCount -= totalCopies;
            this.toner -= totalCopies;
        }
    }
    public void refillPaper(int sheet){
      this.paperCount += sheet;
    }

    public int getToner(){
        return this.toner;
    }
}
