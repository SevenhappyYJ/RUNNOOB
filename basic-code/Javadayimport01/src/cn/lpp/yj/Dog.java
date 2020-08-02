package cn.lpp.yj;
/* 例：this关键字的作用：让类中的一个方法访问该类的另一个方法或者实例变量；----> Dog类
但是在这个例子中是在run方法中创建一个对象然后去调用jump方法。因为没用static修饰的方法要用对象来调用；
下一步我们直接创建一个Dogtest类，在这个类中直接创建对象，然后调用这个方法；*/
public class Dog {
    public void jump(){
        System.out.println("执行jump方法");
    }
    public void run(){
        Dog d = new Dog();
        //这里就是tong
        d.jump();
        System.out.println("执行run方法");
    }

/*看这段话：问题一：在run()方法中调用jump方法，是否一定需要创建一个Dog对象;问题二：是否需要在run方法中重新创建一个Dog对象;
解答：问题一：在这里肯定是需要创建一个Dog对象的，因为jump方法不是static修饰，调用该方法肯定是要用对象去调用；
      问题二：这里是不需要的，因为这里再调用run()方法的时候肯定会使用对象来调用，这里的对象就是Dog对象，所以这里已经存在了一个对象
                ，这样调用jump()方法时就可以使用这个已经存在的对象。这样就可以使用this------>表示调用这个方法的对象；*/
    //这样就可以使用下面的方法了：
   /* public void run(){
        this.jump();
        System.out.println("直接通过this来调用方法");
    }*/


}
/*生活中一个方法依赖另一个方法是比较常见的：
比如吃饭方法依赖拿筷子方法，写代码方法依赖敲键盘的方法。这些个方法中调用他们的对象都是一个，都是我这个对象；
这样对象中一个成员直接调用另一个成员就可以使用this，也可以省略this直接调用；
引申：在类中的static修饰的成员（方法或者变量）也可以省略前面的类名。类似与不用static修饰的非静态成员而用到的this*/
