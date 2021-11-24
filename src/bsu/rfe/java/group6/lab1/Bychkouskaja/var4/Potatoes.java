package bsu.rfe.java.group6.lab1.Bychkouskaja.var4;

public class Potatoes extends Food {
    private String type;

    public Potatoes(String type) {
        super("Картошка");
        this.type = type;
    }

    public void consume() {
        System.out.println(this + " съедена");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Potatoes)) return false;
            return type.equals(((Potatoes)arg0).type);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " типа '" + type.toUpperCase() + "'";
    }
}
