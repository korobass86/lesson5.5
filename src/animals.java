public class animals {
    int weight;
    boolean fly;
    boolean water;
    boolean earth;
}

class birds extends animals {
    int speedFly;
    int wings;
    int hight;
    String name;

    void printInfo (){
        System.out.println(name + " имеет размах крыльев "
        + wings + " см и может подняться на высоту " + hight);
    }
}