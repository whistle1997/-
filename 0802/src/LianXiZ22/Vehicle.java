package LianXiZ22;
/*����һ������ΪVehicle�Ľӿڣ��ڽӿ��������������һ�������ķ���start()��stop()�����������Ʒֱ�ΪBike��Bus������ʵ��Vehicle�ӿڡ�
����һ������ΪinterfaceDemo���࣬��interfaceDemo��main()�����д���Bike��Bus���󣬲�����start()��stop()������  */
interface Vehicle {
	abstract void Start(String name);
	abstract void Stop(String name);
}
