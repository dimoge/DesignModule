/**
 * 抽象 -- 容器角色，只是角色
 */
public interface DockerList {

    public void add(Object o);
    public Object get(int index);
    public Iterator iterator();
    public int getSize();
}
