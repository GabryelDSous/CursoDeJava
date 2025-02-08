package Class;
public class Books implements Publication{
    private String title;
    private String author;
    private int totPages;
    private int curPage;
    private boolean open;
    private People reader;
    
    // Public method

    public String detail() {
        return "Books{" + "title=" + title + "\n, author=" 
                + author + "\n, totPages=" + totPages + ", curPage=" + curPage 
                + ", open=" + open + "\n, reader=" + reader.getName() 
                + ", reader=" + reader.getAge() 
                + ", reader=" + reader.getGender() + '}';
    }

    
    
    // Constructor

    public Books(String title, String author, int totPages, People reader) {
        this.title = title;
        this.author = author;
        this.totPages = totPages;
        this.open = false;
        this.curPage = 0;
        this.reader = reader;
    }
    
     
    
    // Getters and Setter Methods

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
    // Methods' Publication implemented
    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void flipped(int p) {
        if(p > this.totPages) this.curPage = 0;
        else this.curPage = p;
        
    }

    @Override
    public void nextPage() {
        this.curPage++;
    }

    @Override
    public void bacPage() {
        this.curPage--;
    }
}
