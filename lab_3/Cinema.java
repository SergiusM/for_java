import java.util.ArrayList;

public class Cinema {
    private ArrayList<Hall> Halls = new ArrayList<>();
    public Cinema()
    {
    }
    public Cinema(ArrayList<Hall> Halls)
    {
        this.Halls = Halls;
    }

    public Cinema(Hall hall)
    {
        this.Halls.add(hall);
    }

    public String toString()
    {
        String result = new String();
        for(int i = 0; i < Halls.size(); i++)
            result += "\tЗал номер " + i + "\n" + Halls.get(i).toString();
        return  result;
    }

    public void addHall(Hall hall)
    {
        this.Halls.add(hall);
    }
    //public ArrayList<Hall> getHalls() {return this.Halls;}
    public Hall getHall(int i) {return this.Halls.get(i);}
    public ArrayList<Hall>  getHalls() {return this.Halls;}
}
