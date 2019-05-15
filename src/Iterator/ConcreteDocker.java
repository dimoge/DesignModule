/**
 * 具体 -- 容器角色
 */
public class ConcreteDocker implements DockerList {

    Object[] list;
    private int size;
    private int index;

    public ConcreteDocker(){
        this.size = 0;
        this.index = 0;
        list = new Object[100];
    }


    @Override
    public void add(Object o) {
        list[++index] = o;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return 0;
    }
}
