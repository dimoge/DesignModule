/**
 * 代理模式优点：
 *
 * 职责清晰 真实角色只需关注业务逻辑的实现，非业务逻辑部分，后期通过代理类完成即可。
 * 高扩展性 不管真实角色如何变化，由于接口是固定的，代理类无需做任何改动。
 *
 * 理解：boss才是真正开会的人，worker只是调用boss的开会方法， 这里的meet（）是真正的业务逻辑， 非业务逻辑在worker的meeting()方法中进行
 */

public interface Business {

    public void meetimg(String name);

}
