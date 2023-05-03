public class Employee {

    private String vards;
    private String uzvards;
    private String alga;
    private String time;
    private String id;


    public Employee(String vards, String uzvards, String alga, String time, String id) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.alga = alga;
        this.time = time;
        this.id = id;
    }

    public String getVards() {
        return vards;
    }

    public void setVards(String vards) {
        this.vards = vards;
    }

    public String getUzvards() {
        return uzvards;
    }

    public void setUzvards(String uzvards) {
        this.uzvards = uzvards;
    }

    public String getAlga() {
        return alga;
    }

    public void setAlga(String alga) {
        this.alga = alga;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
