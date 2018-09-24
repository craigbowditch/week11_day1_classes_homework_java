public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return this.paper;
    }

    public void print(int copies, int pages) {
        int paper = copies * pages;
        if (this.paper > paper) {
            this.paper -= paper;
            this.toner -= paper;
        }
    }
    public void refillPaper(int sheet){
      this.paper += sheet;
    }

    public int getToner(){
        return this.toner;
    }
}
