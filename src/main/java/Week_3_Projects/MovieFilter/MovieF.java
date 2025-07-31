package Week_3_Projects.MovieFilter;

public class MovieF {
    private String name;
    private int year;
    private String typeOf;
    private double IMDb;

    public MovieF(String name, int year, String typeOf, double IMDb) {
        this.name = name;
        this.year = year;
        this.typeOf = typeOf;
        this.IMDb = IMDb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Please enter a name ");
        }
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=0){
            throw new IllegalArgumentException("Can not be 0");
        }
        this.year = year;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        if(typeOf== null || typeOf.isEmpty() ){
            throw new IllegalArgumentException("Please anter type of Movie.");
        }
        this.typeOf = typeOf;
    }

    public double getIMDb() {
        return IMDb;
    }

    public void setIMDb(double IMDb) {
        if(IMDb<=0){
            throw  new IllegalArgumentException("Can not be 0 or less.");
        }

        this.IMDb = IMDb;
    }

    @Override
    public String toString() {
        return "Movie is name " +
                 name +
                ", year is " + year +
                ", typeOf is '" + typeOf + '\'' +
                ", IMDb is " + IMDb;
    }
}
