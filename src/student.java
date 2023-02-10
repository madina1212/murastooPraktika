public class student {
    private  String name;
    private String surNAme;
    private int groop;
    private  int averagemark;

    public student(String name, String surNAme, int groop,int averagemark) {
        this.name = name;
        this.surNAme = surNAme;
        this.groop = groop;
        this.averagemark = averagemark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurNAme() {
        return surNAme;
    }

    public void setSurNAme(String surNAme) {
        this.surNAme = surNAme;
    }

    public int getGroop() {
        return groop;
    }

    public void setGroop(int groop) {
        this.groop = groop;
    }

    public int getAveragemark() {
        return averagemark;
    }

    public void setAveragemark(int averagemark) {
        this.averagemark = averagemark;
    }
    public int metod(){
        if (averagemark<=5){
            return 2000;
        }else {
            return 1900;
        }

    }
}
