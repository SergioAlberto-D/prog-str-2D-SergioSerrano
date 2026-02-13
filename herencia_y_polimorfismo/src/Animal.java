public abstract class Animal {
    public String name;
    public Animal(String name){
        this.name = name;
    }
    public void alogSonido(){
        System.out.println(name +" hace este sonido");
    }
    public void comer(){
        System.out.println(name +" esta comiendo");
    }

    public abstract void hacerSonido();
}