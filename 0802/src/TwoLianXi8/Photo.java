package TwoLianXi8;
/*(1)	摄影师可以对任何物体拍照，并没有局限于一个具体类别，所以先设计一个接口。
(2)	创建一个拍照接口，实现该接口的类都可以拍照，手机、相机、iPad 等等。
(3)	创建摄影师类，实现摄影方法。
(4)	创建接口的实现类。
(5)	创建测试类，运行系统。*/

interface Photo {
	abstract String TakePhoto();
}
