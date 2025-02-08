package praticalexercice;
public class Books implements Publications{
    private String title;
    private String author;
    private int totPages;
    private int curPage;
    private boolean open;
    private People reader;
    
    // Details

    public String details() {
        return "===================\n" + "Title: " + title + ".\nAuthor: " + author 
                + ".\nTotal pages: " + totPages + ".\nCurrent page: " + curPage 
                + ".\nOpen: " + (open?"Yes":"No") + ".\nReader: " + reader.getName()
                + ".\nAge: " + reader.getAge() + ".\nGender: " + reader.getGender();
    }

    // Constructor

    public Books(String title, String author, int totPages, People reader) {
        this.title = title;
        this.author = author;
        this.totPages = totPages;
        this.curPage = 0;
        this.open = false;
        this.reader = reader;
    }
    
    // Getters and Setters

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private int getTotPages() {
        return totPages;
    }

    private void setTotPages(int totPages) {
        this.totPages = totPages;
    }

    private int getCurPage() {
        return curPage;
    }

    private void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    private boolean isOpen() {
        return open;
    }

    private void setOpen(boolean open) {
        this.open = open;
    }

    private People getReader() {
        return reader;
    }

    private void setReader(People reader) {
        this.reader = reader;
    }
    
    // Implements

    @Override
    public void open() {
        if(this.isOpen()) System.out.println("The book \"" + this.getTitle() + "\" already is opened");
        else this.setOpen(true);
    }

    @Override
    public void close() {
        if(!this.isOpen()) System.out.println("The book \"" + this.getTitle() + "\" already is closed");
        else this.setOpen(false);
    }

    @Override
    public void flipped(int p) {
        if(this.isOpen() == true){
            if(p > this.getTotPages()){
                this.setCurPage(0);
                System.out.println("Max pages reached![" +  this.getTotPages() + " pages]");
            } else curPage += p;
        } else System.out.println("Open the Book!");
        
    }

    @Override
    public void nextPage() {
        if(this.isOpen() == true){
            if(this.curPage+1 > this.getTotPages()) System.out.println(this.getCurPage() + "/" + this.getTotPages());
            else if(this.getCurPage() < 0) System.out.println("Min pages reached!");
            else curPage++;
        } else System.out.println("Open the Book!");
    }

    @Override
    public void backPage() {
        if(this.isOpen() == true){
            if(this.getCurPage() < 1) System.out.println("Min pages reached!");
            else curPage--;
        } else System.out.println("Open the Book!");
    }
    
}
