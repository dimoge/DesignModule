import java.util.List;

/**
 * 具体的 -- 迭代器角色，仅仅是角色
 */
public class ConcreteIterator implements Iterator {
    private DockerList list = null;
    private int index;

    public ConcreteIterator(DockerList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.getSize()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return list.get(++index);
    }
}
