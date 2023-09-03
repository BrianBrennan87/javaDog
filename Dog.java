class Dog {

    private String name;

    private int age;

    private String color;

    public Dog(String name, int age,String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void walk() {
        System.out.println("Dog walks");
    }
    public void sit() {
        System.out.println("Dog sits");
    }
    public void bark() {
        System.out.println("Dog barks");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
}

