/**
 * 单例模式 -- 懒汉模式, DCL双重校验锁模式
 */
public class Singleton3 {

    private static Singleton3 singleton;

    private Singleton3(){

    }

    public static Singleton3 getSingleton(){
        if(singleton == null){
            synchronized(Singleton3.class){
                if(singleton == null){
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }


}
