import java.util.Comparator;

public class Lecture implements Comparator<Lecture> {
    String name;
    int start_H;
    int start_M;
    int fnish_H;
    int fnish_M;

    public Lecture(String name, int start_H, int start_M, int fnish_H, int fnish_M) {
        this.name = name;
        this.start_H = start_H;
        this.start_M = start_M;
        this.fnish_H = fnish_H;
        this.fnish_M = fnish_M;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart_H() {
        return start_H;
    }

    public void setStart_H(int start_H) {
        this.start_H = start_H;
    }

    public int getStart_M() {
        return start_M;
    }

    public void setStart_M(int start_M) {
        this.start_M = start_M;
    }

    public int getFnish_H() {
        return fnish_H;
    }

    public void setFnish_H(int fnish_H) {
        this.fnish_H = fnish_H;
    }

    public int getFnish_M() {
        return fnish_M;
    }

    public void setFnish_M(int fnish_M) {
        this.fnish_M = fnish_M;
    }

    @Override
    public int compare(Lecture l1, Lecture l2) {
        // Compare by start minute first
        int cmp = Integer.compare(l1.getStart_M(), l2.getStart_M());
        if (cmp != 0) return cmp;

        // If start minutes are equal, compare by start hour
        return Integer.compare(l1.getStart_H(), l2.getStart_H());
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", start_H=" + start_H +
                ", start_M=" + start_M +
                ", fnish_H=" + fnish_H +
                ", fnish_M=" + fnish_M +
                '}';
    }
}
