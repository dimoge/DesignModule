public class Main_00 {

    public static void main(String[] args){

        DockerList list = new ConcreteDocker();
        list.add("aaaa");
        list.add("bbbbb");
        list.add("ccccc");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }


    }
}
