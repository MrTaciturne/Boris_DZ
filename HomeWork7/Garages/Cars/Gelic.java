package HomeWork7.Garages.Cars;

public class Gelic {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object equvivalent) {
        if (this == equvivalent) return true;
        if (getClass() != equvivalent.getClass()) return false;
        return false; //Заглушка, чтоб не жаловался
    }

    @Override
    public String toString() {
        return this.getClass().toString() + " " + " ";
    }
}
