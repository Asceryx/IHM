package Exercice2;


import javax.swing.JButton;

public class MyButton extends JButton {
    private int line;
    private int column;
    
    public MyButton(int line, int column) {
        super("(" + line + "," + column + ")");
        this.line = line;
        this.column = column;
    }
    
    public void setLine(int line)
    {
        this.line = line;
    }
    
    public void setColumn(int column)
    {
        this.column = column;
    }
    
    public int getLine() {
        return this.line;
    }
    
    public int getColumn() {
        return this.column;
    }
}