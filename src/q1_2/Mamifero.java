package q1_2;

public abstract class Mamifero extends Animal {
    private int patas;

    public Mamifero (String n, int p)
    {
        super(n);
        setPatas(p);
    }
    
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public abstract void talk();
    
    
}

